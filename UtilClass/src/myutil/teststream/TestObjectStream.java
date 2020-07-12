package myutil.teststream;

import	java.io.FileInputStream;
import	java.io.ObjectInputStream;

import java.io.*;

/**
 * @author LiWei
 * @date 2020/06/09 21:59
 */
public class TestObjectStream {
    public static void main(String[] args) {
        /*// 将对象直接记录在文件中
        Person p1 = new Person("李伟", 18);
        // 对象输出流
        try {
            FileOutputStream fos = new FileOutputStream
                    ("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);  // 将对象拆分成字节碎片，序列化到文件里。因为对象需要可序列化的
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // 读取对象流文件
        try {
            FileInputStream fis = new FileInputStream("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person)ois.readObject();
            System.out.println(p);
            p.eat(); // EOFException说明没有对象，通常会将所有记录的对象存在一个集合中

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
