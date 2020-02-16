package day1.demo2;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.util.List;

public class Update {
    static  void add()throws Exception{
        SAXReader reader = new SAXReader();
        Document doc = reader.read(Update.class.getClassLoader().getResourceAsStream("stu.xml"));
        Element root = doc.getRootElement();
        Element stu = root.element("stu");
        List<Element>list = stu.elements();

        Element sex = DocumentHelper.createElement("sex");
        sex.setText("男");

        //直接修改集合就能成功添加标签
        list.add(1,sex);

        OutputFormat fmt = OutputFormat.createPrettyPrint();

        String path = "xml/src/stu.xml";
        System.out.println(path);
        XMLWriter writer = new XMLWriter(new FileOutputStream(path),fmt);
        writer.write(doc);
        writer.close();

    }

//删除李四下的location
    static void delete()throws Exception{
        SAXReader reader = new SAXReader();
        Document doc = reader.read(Update.class.getClassLoader().getResourceAsStream("stu.xml"));
        Element root = doc.getRootElement();
        //得到李四
        Element li = (Element) root.elements().get(1);
        //li.elements().remove(1);

        //通过父节点删除子节点
        Element loc = li.element("location");
        li.remove(loc);

        //保存
        OutputFormat fmt = OutputFormat.createPrettyPrint();
        String path = "xml/src/stu.xml";
        System.out.println(path);
        XMLWriter writer = new XMLWriter(new FileOutputStream(path),fmt);
        writer.write(doc);
        writer.close();
    }

    static void update()throws Exception{
        SAXReader reader = new SAXReader();
        Document doc = reader.read(Update.class.getClassLoader().getResourceAsStream("stu.xml"));
        Element root = doc.getRootElement();
        //得到李四
        Element li = (Element) root.elements().get(1);
         //修改
        li.element("grage").setText("60");

        //保存
        OutputFormat fmt = OutputFormat.createPrettyPrint();
        String path = "xml/src/stu.xml";
        System.out.println(path);
        XMLWriter writer = new XMLWriter(new FileOutputStream(path),fmt);
        writer.write(doc);
        writer.close();
    }
    public static void main(String[] args) throws Exception {
        update();
    }
/*
* 把一xml文件中内容解析成对象放入集合中
*
* */
}
