package myutil.teststream;
import	java.io.File;
import	java.io.FileOutputStream;

import java.io.*;

/**
 * @author LiWei
 * @date 2020/06/09 15:38
 */
public class OperateFile {

    /*// 设计一个方法，实现文件夹的剪切
    public void cutFile() {
        this.superCopyFile();
        this.delereFile();
    }*/

    // 设计一个方法，实现文件的复制
    public void copyFile(File file, String path){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 读文件
            fis = new FileInputStream(file);
            // 写文件
            File newFile = new File(path+ "//" + file.getName());
            fos = new FileOutputStream(newFile);

            byte[] data = new byte[1024];  // 通过创建的数组为1kb~8kb之间
            int count = fis.read(data);

            while (count != -1) {
                // 每一次数组的前两个元素位置互换
                // byte temp = data[0];
                // data[0] = data[1];
                // data[1] = temp;
                fos.write(data, 0, count);  // 将读取到的有效字节写入
                fos.flush();
                count = fis.read(data);
            }
            System.out.println("复制完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    // 设计一个方法，实现文件夹的复制（包括文件的复制、文件夹的复制）
    public void superCopyFile(File file, String newPath) {
        // 获取file的绝对路径
        String oldFilePath = file.getAbsolutePath();
        String newFilePath = newPath + oldFilePath.split(":")[1];
        // 创建一个新的file对象
        File newFile = new File(newFilePath);

        // 判断当前传递进来的file是个文件还是文件夹
        File[] files = file.listFiles();  // 获取当前传递进来的file对象所有元素

        if(files != null) { // file是一个文件夹，才有数组对象
            // 通过新的file对象操作，在硬盘上创建一个文件夹
            newFile.mkdir();
            System.out.println(newFile.getName() + "文件夹复制完毕");
            if(files.length != 0) {
                for(File f : files) {
                    this.superCopyFile(f, newPath);
                }
            }
        }else {  // file是一个文件，没有子元素，不需要数组对象
            // 创建两个文件流，分别读取旧的file和写入新的newFile
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                byte[] data = new byte[1024];
                int count = fis.read(data);
                while (count != -1) {
                    fos.write(data, 0, count);
                    fos.flush();
                    count = fis.read(data);
                }
                System.out.println(newFile.getName() + "文件复制完毕");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert fis != null;
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    assert fos != null;
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        OperateFile of = new OperateFile();
        of.superCopyFile(new File("C:\\test"),
                "F:\\Workspace\\Java\\jdk-11中文api修订版\\test");
    }
}
