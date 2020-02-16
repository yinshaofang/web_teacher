package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建对象的工厂
 * 使用这个工厂需要在类加载路径下有一个配置文件
 * 名字为objects.txt
 * 文件结构为key=包名.类名，可以有多行
 * 这个工厂会根据配置文件将所有对象创建，并缓存下来
 * 创建的对象都是单例的
 * @author 李恒
 *
 */
public class ObjectFactory {
	private static Map<String,Object> objects=new HashMap<String, Object>();
	
	
	static{
		BufferedReader br=null;
		try {
			br=new BufferedReader(
					new InputStreamReader(
							ObjectFactory.class
										 .getClassLoader()
										 .getResourceAsStream("objects.txt")));
			
			
			String s;
			
			while((s=br.readLine())!=null){
				String[] entry=s.split("=");
				objects.put(entry[0], Class.forName(entry[1]).newInstance());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("ObjectFactory初始化错误"+e);
		} finally {
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 工厂方法，获得对象
	 * @param key 根据配置文件中等号左边的key的值查找需要的对象
	 * @return 对应的对象，这个对象是单例的，如果没找到返回null
	 */
	public static Object getObject(String key){
		return objects.get(key);
	}
}
