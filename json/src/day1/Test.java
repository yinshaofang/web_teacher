package day1;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String rs = "{\"address\":\"nj\"}";
        //把Java对象转为JSON格式字符串    JSON.toJSONString(Object)
        rs = JSON.toJSONString(new User("nj"));
        ArrayList<User> list = new ArrayList();
        list.add(new User());
        System.out.println(rs);

        //把JSON格式字符串转为JAVA对象
        User o = JSON.parseObject(rs,new TypeReference<User>(){});//new TypeReference(){}匿名内部类 必须泛型
        System.out.println(o.address);
    }
}
