package myutil.teststream;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * @author LiWei
 * @date 2020/06/09 12:37
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        /*File file = new File("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\test.txt");
        try {
            FileInputStream fis = new FileInputStream(file);  // 真实去读文件内容
            int code = fis.read(); // 每次读取一个字节
            while(code != -1) {
                System.out.print((char)code);
                code = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            FileInputStream fis = new FileInputStream("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\test.txt");
            int v = fis.available();  // 表示当前流管道中还有多少缓存的字节
            System.out.println(v);

            // 创建一个空的数组,用于存放读取内容
            byte[] b = new byte[5];
            int count = fis.read(b);  // 去文件里读内容，存到数组b内，count为读取到的有效字节个数
            while (count != -1) {
                String value = new String(b, 0, count);  // 取b中有效字节个数
                System.out.print(value);
                count = fis.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\test.txt");
            long v = fis.skip(5);
            System.out.println(v);
            int code = fis.read();
            System.out.println((char)code);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();  // 关闭的时流通道，不是file对象
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
