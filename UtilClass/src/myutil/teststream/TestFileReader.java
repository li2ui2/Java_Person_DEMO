package myutil.teststream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author LiWei
 * @date 2020/06/09 18:25
 */
public class TestFileReader {
    public static void main(String[] args) {
        // 字符型文件输入流
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\aaa.txt");
            /*int code = fr.read();
            System.out.println((char) code);*/
            char[] c = new char[1024];
            int count = fr.read(c);
            while (count != -1) {
                System.out.println(new String(c, 0, count));
                count = fr.read(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
