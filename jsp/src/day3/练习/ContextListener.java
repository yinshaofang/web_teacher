package day3.练习;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
//练习：监听器。。。 在游戏中，对于长期不活动的用户，删除session
public class ContextListener implements ServletContextListener,HttpSessionListener{
    //创建集合
    List<HttpSession> sessions = new ArrayList<>();
    @Override
    public void contextInitialized(ServletContextEvent e) {
        //开始扫描  java中定时器Timer 相当于开了一个线程
        Timer t = new Timer();
        //1秒后开始执行任务，执行后，每隔两秒执行一次
        t.schedule(new TimerTask() {
            public void run() {
                System.out.println("扫描过期的session.....");
                for(int i =0;i<sessions.size();i++){
                    HttpSession session = sessions.get(i);
                    //当前毫秒-上次获取的时间>5000毫秒
                    if(System.currentTimeMillis()-session.getLastAccessedTime()>5000){
                        sessions.remove(session);//删除
                        //把自己弄死
                        session.invalidate();
                        i--;//****避免错过第二个****
                    }
                }
            }
        },1000,2000);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {}

    @Override
    public void sessionCreated(HttpSessionEvent e) {
        //得到session
        HttpSession session = e.getSession();
        //把session放到集合中
        sessions.add(session);
        System.out.println("集合中多了一个session,sessionId为"+session.getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
        System.out.println(e.getSession().getId()+"已经超时，被销毁了....");
    }
}
