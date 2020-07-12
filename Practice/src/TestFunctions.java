/**
 * @author LiWei
 * @date 2020/05/26 20:36
 */
public class TestFunctions {
    public String[][] userBox = {{"ZhangSan", "123456"},
                                 {"LiSi", "66666"},
                                 {"WangWu", "88888"}};

    // 设计一个方法，给数组进行排序（既能升序又能降序）
    public void orderArray(int[] array, boolean flag) {
        // flag为true进行升序排列，否则进行降序排列
        for(int i=1; i < array.length; i++){
            for (int j=array.length-1; j>=i; j--) {
                if(flag && array[j] < array[j-1] ||
                        !flag && array[j] > array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    // 设计一个方法，用来实现用户登录认证（二维数组当作小数据库）
    public String login(String user, String password) {

        String result = "用户名或密码错误";
        for (String[] box : userBox) {
            if (box[0].equals(user)) {
                if (box[1].equals(password)) {
                    // System.out.println("登录成功");
                    result = "登录成功";
                }
            }
            break;
        }
        return result;
    }
}
