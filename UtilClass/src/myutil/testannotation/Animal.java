package myutil.testannotation;

import java.io.Serializable;

/**
 * @author LiWei
 * @date 2020/06/11 22:18
 */

@SuppressWarnings("serial")
public class Animal implements Serializable {
    // private static final long serialVersionUID = -4580243073482539405L;

    public void eat() {
        System.out.println("父类吃饭的方法");
    }
}
