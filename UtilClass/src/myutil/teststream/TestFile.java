package myutil.teststream;

import java.io.File;

/**
 * @author LiWei
 * @date 2020/06/09 9:50
 */
public class TestFile {
    // 设计一个方法，用来遍历文件夹
    public void showFile(File file) {

        System.out.println(file.getAbsolutePath());

        // 判断如果file是一个文件夹，且文件夹内有元素
        File[] files = file.listFiles();
        if(files != null && files.length != 0) {
            for (File f : files) {
                this.showFile(f);
            }
        }
        // 若file为一个文件或是一个空文件夹
        //System.out.println(file.getAbsolutePath());
    }

    // 设计一个方法，用来删除文件夹
    public void deleteFile(File file) {
        // 判断file不是空文件夹
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.deleteFile(f);
            }
        }
        file.delete();
    }

    public static void main(String[] args) {
        /*File file = new File("F://Workspace//Java//jdk-11中文api修订版//jb51.net.txt");
        // file对象 是真正的文件吗？  不是
        // file对象是在堆内存中创建出来的一个对象空间
        // 路径是看创建的对象是否能与硬盘中的一个真实文件产生对应映射关系
        // 通过文件流去读取文件的内容
        // 系统内硬盘上的文件名字是不区分大小写的，内存中File对象的变量名字是区分大小写的
        // 文件本身的有些属性
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

        System.out.println(file.isFile());  // 判断当前的file是否是一个文件
        System.out.println(file.isDirectory());  // 判断当前的file是否是一个目录

        long l = file.length();
        System.out.println(l);  // 获取文件大小

        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss");
        System.out.println(sdf.format(date));  // 获取文件最后修改的时间

        // file.setLastModified(time);  // 修改文件最后修改的时间
        String name = file.getName();
        String path = file.getAbsolutePath();
        System.out.println(path + "\t" + name);*/

        /*File file2 = new File("F://Workspace//Java//jdk-11中文api修订版//test.txt");
        try {
            boolean value = file2.createNewFile();
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        File file = new File("F://Workspace//Java//jdk-11中文api修订版//test//haha");
        // System.out.println(file.mkdir());  // 所创建的文件夹的外层（父元素）需要真实存在
        // System.out.println(file.getAbsolutePath());
        boolean value = file.mkdirs();
        System.out.println(value);

        /*File file = new File("F://Workspace//Java//jdk-11中文api修订版//test//test.txt");
        String pname = file.getParent();  // 当前file的父亲名字
        File pfile = file.getParentFile();  // 当前file的父亲对象
        System.out.println(pname);
        while(pfile != null) {
            System.out.println(pfile.getAbsolutePath());
            pfile = pfile.getParentFile();
        }*/

        /*File file = new File("F://Workspace//Java//jdk-11中文api修订版//test");
        // 数组对象为空，证明当前的file是一个文件
        // 数组对象不为空，证明当前file是一个文件夹
        // 数组对象的长度不为0，证明当前的file是一个不为空的文件夹，文件夹内有元素
        File[] files = file.listFiles();
        assert files != null;
        System.out.println(files.length);
        // 通过递归来遍历files
        TestIO tio = new TestIO();
        tio.showFile(file);*/

        /*File file = new File("F://Workspace//Java//jdk-11中文api修订版//test");
        // boolean value = file.delete();
        // System.out.println(value);
        TestFile tio = new TestFile();
        tio.deleteFile(file);*/
    }

}
