package day6.mytag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyTag1 extends SimpleTagSupport {
    int num;
    String value;

    public void doTag() throws JspException,IOException{
        PageContext content =(PageContext) this.getJspContext();
        JspWriter out =content.getOut();//获取其他内置对象
        for (int i=0;i<num;i++){
            out.print(value+"<br>");//显示到页面
        }
    }
    //框架：类必须要封装
    public void setNum(int num) {
        this.num = num;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNum() {
        return num;
    }

    public String getValue() {
        return value;
    }
}
