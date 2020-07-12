package rely;

import com.sun.net.httpserver.Authenticator;

import java.io.File;

/**
 * @author LiWei
 * @date 2020/05/28 10:44
 */
public class Test {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Pig pig = farmer.feedPig(5);
        Butcher butcher = new Butcher();
        butcher.killPig(pig);
    }
}
