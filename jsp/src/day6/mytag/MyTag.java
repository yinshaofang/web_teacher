package day6.mytag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyTag extends SimpleTagSupport {
    int num;
    String value;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void doTag() throws JspException, IOException {
        PageContext context = (PageContext) this.getJspContext();
        JspWriter out = context.getOut();
        for(int i = 0;i<num;i++){
            out.print(value+"<br>");
        }
    }
}
