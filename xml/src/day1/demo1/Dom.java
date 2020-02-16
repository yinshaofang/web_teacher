package day1.demo1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.util.List;

public class Dom {
    public static void parse(String name) throws DocumentException {
        //1.创建解析器
        SAXReader r = new SAXReader();
        //从类所在路径中读取文件
        Document doc = r.read(Dom.class.getResourceAsStream(name));
        System.out.println(doc.asXML());

        //所有节点都是element类型，先获取根节点
        Element root = doc.getRootElement();

        //获取节点中子节点
        List<Element>childs = root.elements();

        //获取节点下标签名为stu的全部子节点
        System.out.println(root.elements("stu"));
        System.out.println("================");
        System.out.println(root.element("stu"));//第一个
        Element first = childs.get(0);//第一个
        System.out.println("标签中属性名为name的值："+first.attributeValue("name"));
        System.out.println("标签名为：" + first.getName());

        System.out.println("获取标签中间的内容"+first.element("name").getTextTrim());

    }

    static void createXML() throws Exception {
        Document doc = DocumentHelper.createDocument();

        //增加根节点
        Element books = doc.addElement("books");

        //增加子节点
        Element book1 = books.addElement("book");
        Element title1 = book1.addElement("title");
        Element author1 = book1.addElement("author");

        Element book2 = books.addElement("book");
        Element title2 = book2.addElement("title");
        Element author2 = book2.addElement("author");

        //为子节点加属性
        book1.addAttribute("id","001");
        title1.setText("三国演义");
        author1.setText("罗贯中");

        book2.addAttribute("id","002");
        title2.setText("红楼梦");
        author2.setText("曹雪芹");

        //生成xml文件的格式
        OutputFormat fmt = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileOutputStream("books.xml"),fmt);
        writer.write(doc);
        writer.close();
    }
    public static void main(String[] args) throws Exception {
        //parse("a.xml");//转换为字符串
        createXML();

    }
}
