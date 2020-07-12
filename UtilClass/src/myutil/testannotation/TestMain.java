package myutil.testannotation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author LiWei
 * @date 2020/06/11 22:48
 */
public class TestMain {
    public static void main(String[] args) {
        // Properties是java.util包下的，HashMap的子类   集合--内存  读取文件信息
        // 读取配置文件的信息 文件.properties

        try {
            // 创建时更像一个高级流
            Properties pro = new Properties();
            pro.load(new FileReader("src\\myutil\\testannotation\\test.properties"));
            // 使用的时候更像是map集合 value=get(key)
            // String value1 = pro.getProperty("key1");
            // System.out.println(value1);

            // 获取全部的key keySet()    entrySet()
            Enumeration<String> en = (Enumeration<String>) pro.propertyNames();  // 获取全部的key
            // Enumeration类型的使用像是迭代器    hasNext() next()
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = pro.getProperty(key);
                System.out.println(key + "---" + value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
