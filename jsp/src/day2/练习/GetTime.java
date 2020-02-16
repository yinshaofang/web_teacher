package day2.练习;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        Cookie[]arr = req.getCookies();
        Cookie c=null;
        if(arr!=null){
            for(Cookie tmp:arr){
                if("last".equals(tmp.getName())){
                    c=tmp;
                    break;
                }
            }
        }
        Writer out = resp.getWriter();
        if(c==null){
            out.write("<h1>这是你第一次访问本站!</h1>");
        }else{//不是第一次
            String value=c.getValue();
            out.write("<h1>你上次访问本站时间："+value+"</h1>");
        }

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sdf.format(date);
        c = new Cookie("last",now);
        resp.addCookie(c);

    }
}
