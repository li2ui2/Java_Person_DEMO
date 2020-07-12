package myutil.teststream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author LiWei
 * @date 2020/06/09 15:05
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        /*// 创建一个字节型文件输出流
        File file = new File("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\aaa.txt");
        // 创建的是文件输入流，若文件路径有问题，则抛出异常，FileNotFoundException
        // 创建的是文件输出流，若文件路径有问题，则直接帮我们创建一个新的文件
        try {
            // FileOutputStream fos = new FileOutputStream(file)  // 每次写入会覆盖
            FileOutputStream fos = new FileOutputStream(file,true);  // 追加模式
            fos.write(98);
            fos.flush(); // 刷新 将流管道中的字节推到文件中
            System.out.println("文件写入完毕");


        } catch (IOException e) {
            e.printStackTrace();
        }*/

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream
                    ("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\aaa.txt", true);
            // 创建一个数组，带着信息
            // byte[] b = new byte[] {97,98,99,100};
            String str = "1+1=2";
            byte[] b = str.getBytes();
            fos.write(b);
            fos.flush();
            System.out.println("文件写入完毕");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
