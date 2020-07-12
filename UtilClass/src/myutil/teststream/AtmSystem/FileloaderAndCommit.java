package myutil.teststream.AtmSystem;
import java.io.*;
import	java.util.HashMap;
import java.util.Iterator;

/**
 * @author LiWei
 * @date 2020/06/10 14:58
 */
public class FileloaderAndCommit {
    private String fileName = null;
    public FileloaderAndCommit(String fileName) {
        this.fileName = fileName;
    }

    // 程序块的目的在对象创建之前，给集合进行赋值操作
    public HashMap<String, User> loadFile() {
        HashMap<String, User> userBox = new HashMap<String, User>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // 创建一个输入流，读取只是文件的记录
            File file = new File(fileName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String value = bufferedReader.readLine();
            while (value != null) {
                // value信息拆分成三段，构建一个User对象，并存入集合
                String[] userValue = value.split("-");
                User user = new User(userValue[0], userValue[1], Float.parseFloat(userValue[2]));
                userBox.put(user.getName(), user); // put(账号，User对象)
                value = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return userBox;
    }
    // 设计一个方法，将集合内所有最终的数据全部写入文件
    public void commit(HashMap<String, User> userBox) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            // 创建一个字符型文件输出流
            File file = new File(fileName);

            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            Iterator<String> names = userBox.keySet().iterator();
            while (names.hasNext()) {
                String name = names.next();  // 集合内获取的某一个人名
                User user = userBox.get(name);
                // 将user对象中的真实数据拼接成一行字符串
                StringBuilder builder = new StringBuilder(user.getName());
                builder.append("-");
                builder.append(user.getPassword());
                builder.append("-");
                builder.append(user.getBalance());
                // 通过字符型文件输出流，将拼接好的builder写入文件
                bufferedWriter.write(builder.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
