package myutil.testannotation;
import java.io.FileReader;
import java.io.IOException;
import	java.util.ArrayList;

import myutil.teststream.AtmSystem.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/**
 * @author LiWei
 * @date 2020/06/11 22:14
 */
public class Person extends Animal implements TestInterface {


    // 方法重写
    // 继承关系
    @Override
    @SuppressWarnings("all")
    public void eat() {
        // 什么时候---时间
        Date date = new Date();  // 当前系统时间
        date.getYear(); // 当前的方法是废弃的，过时的
    }

    @Override
    @SuppressWarnings({"unused","rawtypes"})
    public void test() {
        String str = "abc";
        System.out.println(str);
        ArrayList list = new ArrayList();
    }
}
