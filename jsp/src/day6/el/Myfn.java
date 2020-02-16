package day6.el;

/**
 * el自定义函数步骤:
 * 1、类中加静态方法（多个）
 * 2、在WEB-INF下创建.tld文件(编辑)
 * 3、file.jsp中调用el表达式
 */
public class Myfn {

    public static String showMsg(String name){
        //想把字符串转换为新的字符串
        return "msg:"+name;
    }
}
