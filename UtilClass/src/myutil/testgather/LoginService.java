package myutil.testgather;

import java.util.*;

/**
 * @author LiWei
 * @date 2020/06/08 11:07
 */
public class LoginService {

    // 设计一个方法，用来登录认证，一维数组
    private final String[] userBox1 = new String[] {"张三", "李四", "王五"};
    private final int[] passwordBox1 = new int[] {1, 2, 3};
    public String loginForArray(String name, String password) {
        for (int i = 0; i < userBox1.length; ++i) {
            if(userBox1[i].equals(name)) {
                if (passwordBox1[i] == Integer.parseInt(password)) {
                    return "登录成功";
                }
                break;
            }
        }
        return "用户名或密码错误";
    }

    // 设计一个方法，用来登录认证，ArrayList
    private final ArrayList<String> userBox2 = new ArrayList<>();
    {
        userBox2.add("张三-1");
        userBox2.add("李四-2");
        userBox2.add("王五-3");
    }
    public String loginForList(String name, String password) {
        for (String box : userBox2) {
            String[] value = box.split("-");
            if (value[0].equals(name)) {
                if (value[1].equals(password)) {
                    return "登录成功";
                }
                break;
            }
        }
        return "用户名或密码错误";
    }

    // 设计一个方法，用来登录认证，Set
    private final HashSet<String> userBox3 = new HashSet<> ();
    {
        userBox3.add("张三-1");
        userBox3.add("李四-2");
        userBox3.add("王五-3");
    }
    public String loginForSet(String name, String password) {
        Iterator<String> it = userBox3.iterator();
        while (it.hasNext()) {
            String[] value = it.next().split("-");
            if (value[0].equals(name)) {
                if (value[1].equals(password)) {
                    return "登录成功";
                }
                break;
            }
        }
        return "用户名或密码错误";
    }

    // 设计一个方法，用来登录认证，Set
    private final HashMap<String,Integer> userBox4 = new HashMap<String, Integer> ();
    {
        userBox4.put("张三", 1);
        userBox4.put("李四", 2);
        userBox4.put("王五", 3);
    }
    public String loginForMap(String name, String password) {
        Integer realPassword = userBox4.get(name);
        if(realPassword != null
                && realPassword.equals(Integer.parseInt(password))) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }
}
