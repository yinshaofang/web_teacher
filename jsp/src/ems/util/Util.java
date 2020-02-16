package ems.util;

import ems.entity.Emp;

import javax.servlet.http.HttpServletRequest;
// 新增 、修改
public class Util {
    public static Emp getEmp(HttpServletRequest req) {
        String sid = req.getParameter("id");
        Integer id = sid==null?null:Integer.valueOf(sid);//防止为null
        String name = req.getParameter("name");
        String sal = req.getParameter("salary");
        double salary = "".equals(sal) ? 0 :Double.parseDouble(sal);//防止前端没写
        String gender = req.getParameter("gender");
        String edu = req.getParameter("edu");
        String[]arr = req.getParameterValues("hobbies");//多个

        StringBuilder sb = new StringBuilder();
        for(String t:arr){
            sb.append(t+",");
        }
        String hobbies = sb.deleteCharAt(sb.length()-1).toString();
        return new Emp(id,name,salary,gender,edu,hobbies);
    }


}
