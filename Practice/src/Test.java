import java.util.Scanner;

/**
 * @author lee
 */
public class Test {
    public static void main(String[] args){
        /*System.out.println("hello");
        System.out.println();
        Person p = new Person();
        p.name = "lee";
        p.age = 24;
        p.sex = "male";
        System.out.println(p.name + "今年" + p.age + "岁，性别是" + p.sex);*/

        /*// TestFunctions测试
        TestFunctions tf = new TestFunctions();
        int[] array = new int[] {5, 3, 4, 2, 1};
        // 数组冒泡排序
        tf.orderArray(array, false);
        for(int v : array){
            System.out.println(v);
        }
        // 实现用户登录认证
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号：");
        String user = input.nextLine();
        System.out.println("请输入密码：");
        String password = input.nextLine();
        String result = tf.login(user, password);
        System.out.println(result);*/

        /*// TestConstructor构造函数 this 程序块测试
        TestConstructor p = new TestConstructor("李伟", 24,"男");
        System.out.println(p.name + "今年" + p.age + "岁，性别为" + p.sex);*/

        // 自定义数组功能测试
        ArrayBox<Integer> box = new ArrayBox<Integer>(6);  // 存储之后长度还能改变
        // 添加元素
        for(int i=1; i <= 6; i++){
            box.add(10 * i);
        }  // 10 20 30 40 50 60 0 0 0 0
        // 此时数组真实长度为10，但只存了6个数，所以有效元素个数为6个
        System.out.println("有效元素个数：" + box.size());  // 6
        System.out.println("真实数组长度：" + box.lengthOfElementData());  // 10
        // 获取数组全部元素
        // int value = box.get(10);
        for(int i=0; i< box.size(); i++) {
            int value = box.get(i);
            System.out.print(value + " ");
        }
        System.out.println();
        // 删除2号索引位置的元素
        int removeValue = box.remove(2);
        System.out.println("删除元素为：" + removeValue);
        System.out.println("当前有效元素个数为：" + box.size());
        for(int i=0; i< box.size(); i++) {
            int value = box.get(i);
            System.out.print(value + " ");
        }
    }
}
