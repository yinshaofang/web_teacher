package controller;

import com.alibaba.fastjson.JSON;
import entity.Data;
import entity.Result;
import jdbc.tmp.Tmp;
import mapper.DataMapper;
import mvc.annotation.RequestMapping;
import mvc.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@RequestMapping("")
public class DataHandle {
    @RequestMapping("/checkKey")
    public void checkkey(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //查询关键字s1
        //查询信息s122
        //查询信息s111
        String sql = "select msg,keyword from t_data where keyword=?";
        String key = req.getParameter("key");
        List<Data> list = Tmp.query(sql,new DataMapper(),key);
        String msg="";
        if(list.isEmpty()){
            msg = "<font color='green'>可正常添加</font>";
        }else{
            msg = "<font color='red'>key已存在</font>";
        }

        PrintWriter out = resp.getWriter();
        out.print(msg);//传给前台的值
    }

    @RequestMapping("/checkKeyJson1")
    public void checkkey2(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String sql = "select msg,keyword from t_data where keyword=?";
        String key = req.getParameter("key");
        List<Data> list = Tmp.query(sql,new DataMapper(),key);
        String msg="";
        if(list.isEmpty()){
            msg = "<font color='green'>可正常添加</font>";
        }else{
            msg = "<font color='red'>key已存在</font>";
        }

        PrintWriter out = resp.getWriter();
        //转换为json格式的字符串（放很多属性）
        msg = JSON.toJSONString(new Result(msg));
        out.print(msg);
    }
    @RequestMapping("/checkKeyJson")
    @ResponseBody// 作用一样，可替换最后三行代码
    public Result checkkey3(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String sql = "select msg,keyword from t_data where keyword=?";
        String key = req.getParameter("key");
        List<Data> list = Tmp.query(sql,new DataMapper(),key);
        String msg="";
        if(list.isEmpty()){
            msg = "<font color='green'>可正常添加</font>";
        }else{
            msg = "<font color='red'>key已存在</font>";
        }
        return new Result(msg);//不是响应对象，通过注解ResponseBody 转换为上面的三行代码操作，返回的是字符串格式
    }

    @RequestMapping("/getInfo")
    public void addInfo(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        System.out.println("getInfo...");
        PrintWriter out = resp.getWriter();
        out.print("信息查询系统");
    }

    @RequestMapping("/findOne")
    @ResponseBody
    public Data findOne(HttpServletRequest req,HttpServletResponse resp) throws IOException, SQLException {
        System.out.println("findOne...");
        String sql = "select msg,keyword from t_data where keyword=? or msg=?";
        String key = req.getParameter("key");
        List<Data> list = Tmp.query(sql,new DataMapper(),key,key);
        return list.isEmpty()?null:list.get(0);
        //{key:abc,msg:hello}
    }

    @RequestMapping("/findMore")
    @ResponseBody
    public List<Data> findMore(HttpServletRequest req,HttpServletResponse resp) throws IOException, SQLException {
        System.out.println("findMore...");
        String sql = "select msg,keyword from t_data where keyword like ? or msg like ?";
        String key = req.getParameter("key");
        List<Data>list =  Tmp.query(sql,new DataMapper(),"%"+key+"%","%"+key+"%");
        System.out.println(JSON.toJSONString(list));
        return list;
    }

    @RequestMapping("/p")
    public void p(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        Result r = new Result("hello");
        String rs = JSON.toJSONString(r);// 实质上jsp端的data获取的是rs字符串 hello
        String callback=req.getParameter("callback");//跨域默认参数
        System.out.println(callback);
        rs = callback+"("+rs+")";//拼接callback，本质上想调用本地js中一个函数，如果没有就直接调用success方法 把js对象传到data中，
        resp.getWriter().write(rs);//跨不跨域由服务器掌握主动， 如国家气象局支持跨域
    }
}
