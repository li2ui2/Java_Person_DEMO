package myutil.teststring;

/**
 * @author LiWei
 * @date 2020/06/06 20:19
 */
public class TestString {

    // 设计一个方法，将给定字符串中的全部数字找到
    // "za10das1hjf45das7" ---> 101457
    public int findNumber(String str) {
        StringBuilder result = new StringBuilder();
        // 循环找寻字符串中的每一个字符
        // 判断当前找到的字符是否是数字
        for (int i = 0; i < str.length(); i++) {
            int code = str.codePointAt(i);  // 每一个字符对应的code码
            if(code>=48 && code<=57) {
                result.append((char) code);
            }
        }
        // 将找到的数字返回
        return Integer.parseInt(String.valueOf(result));
    }


    // 设计一个方法，将给定的字符串每一个首字母大写
    // “this is a test of java” ---> “This Is A Test Of Java”
    public String firstLetterToUpperCase(String str) {
        String result = "";
        // 将完成的字符串按照空格拆分成好多单词
        String[] value = str.split(" ");
        // 循环处理每一个单词，截取首字母-->大写，截取其余字母，进行整体拼接
        // 获取每一个单词
        for (String word : value) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String otherLetters = word.substring(1);
            result = result.concat(firstLetter.concat(otherLetters) + " ");
        }
        // 每一次的单词拼接成一个完整的字符串，并返回
        return result.trim();
    }

    // 设计一个方法，统计给定字符在字符串中出现的次数 “this is a test of java”, "a" ---> 3
    public int letterExistCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
        // return str.length()-str.replace(String.valueOf(letter),"").length();
    }

    // 设计一个方法，寻找若干个字符串中最长的那个
    public String findMaxLengthString(String...strs) {
        String result = strs[0];
        int maxLength = strs[0].length();
        for (int i = 1; i < strs.length; ++i) {
            if (strs[i].length() > maxLength) {
                maxLength = strs[i].length();
                result = strs[i];
            }
        }
        return result;
    }

    // 设计一个方法，将给定的字符串右位移x位置 (helloworld，2) --> ldhellowor
    public String movaToRight(String str, int count) {
        if(count<0) {
            System.out.println("返回异常");
        }
        if(count > str.length()) {
            count %= str.length();
        }
        // 截取x位置
        String begin = str.substring(0, str.length()-count);
        String end = str.substring(str.length()-count);
        // 拼接返回
        return end.concat(begin);
    }

    // 设计一个方法，判断给定字符串是否是回文
    public boolean isPalindrome(String str) {
        // 传递进来的str先反转
        // 用str与反转之后的字符串进行比较，若一致，证明是回文
        return this.reverse(str).equals(str);
    }

    // 设计一个方法，将给定字符串的正序和反序进行连接 ok--okko
    public String reverseAndConcat(String str) {
        // 将字符串反转
        String res = this.reverse(str);
        // str拼接翻转过来的字符串
        return str.concat(res);
    }

    // 设计一个方法，将字符串反转
    public String reverse(String str) {
        /*// 将str变化成数组
        char[] value = str.toCharArray();
        // 数组头尾互换
        for (int i = 0; i < value.length/2; ++i) {
            char temp = value[i];
            value[i] = value[value.length-1-i];
            value[value.length-1-i] = temp;
        }
        return new String(value);*/
        return new String(new StringBuilder(str).reverse());
    }


    public static void main(String[] args) {
        /*String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1==s2);  // true
        System.out.println(s1==s3);  // false
        System.out.println(s3==s4);  // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s3.equals(s4));  // true*/

        /*// String的构建
        byte[] value = new byte[] {65,97,48};
        String str = new String(value);  // Aa0
        System.out.println(str);

        char[] value2 = new char[] {'A', 'a', '0'};
        String str2 = new String(value2);  // Aa0
        System.out.println(str2);

        char[] value3 = {'h', 'e', 'l', 'l', 'o'};
        // offset为索引起始位置，count为长度
        String str3 = new String(value3, 1, 3);  // ell
        System.out.println(str3);*/

        /*String str1 = "abc";
        String str2 = "abc";
        // System.out.println(str1.compareTo(str2));
        // 按照两个字符串长度较短的那个作为比较循环的次数
        // 挨个比较元素 str1[i]-str2[i],循环内如果有结果就直接输出该结果
        // 如果循环后发现所有的字符都一样，len1-len2
        // 返回0表示两个字符串相等

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);
            System.out.println(x);
            int value = str1.codePointAt(i);
            result.append((char)(value - 48));
            // System.out.println((char)value);
        }
        System.out.println(result);
        String ans = str1.concat(result.toString());
        System.out.println(ans);
        System.out.println(str1);  // str1不可变*/

        /*String str3 = "a" + "b" + "c" + "d";  // +可用于拼接字符
        System.out.println(str3);
        // 过程中产生了几个String对象
        // 字符串常量池中产生了7个，"a"  "b"  "ab"  "c"  "abc"  "d"  "abcd"

        boolean value = str3.contains("a");

        String str4 = "abcdefbg";
        byte[] b = str4.getBytes();
        for(byte v:b){
            System.out.println((char)v);
        }

        char[] c = str4.toCharArray();
        for(char v:c){
            System.out.println(v);
        }*/

        /*int index = str4.indexOf("be");
        int index2 = str4.indexOf("b",2);
        System.out.println(index);
        System.out.println(index2);

        int index3 = str4.indexOf(98);
        int index4 = str4.indexOf(98, 3);
        System.out.println(index3);
        System.out.println(index4);*/

        /*String str = "我爱你中国-我爱你中国-我爱你中国";
        str = str.replace("中国", "杭州");
        System.out.println(str);
        str = str.replaceAll("中国", "杭州");
        System.out.println(str);
        str = str.replaceFirst("杭州", "中国");
        System.out.println(str);

        String[] v = str.split("-");
        for(String a:v){
            System.out.println(a);
        }
        String[] v2 = str.split("-",2);
        for(String a:v2){
            System.out.println(a);
        }*/

        /*// 登录
        String[] userBox = {"liwei-123456", "zhangsan-123456","lisi-123456"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号：");
        String name = input.nextLine();
        System.out.println("请输入密码：");
        String password = input.nextLine();
        boolean b = false;
        for (String box : userBox) {
            String[] value = box.split("-");
            if (value[0].equals(name)) {
                if (value[1].equals(password)) {
                    System.out.println("登录成功");
                    b = true;
                }
            }
        }
        if(!b){
            System.out.println("用户名或者密码错误");
        }*/

        String str = "abcdefgh";
        str = str.substring(3, 5); // 返回[3,5)的串
        System.out.println(str);

        TestString ts = new TestString();
        System.out.println(ts.reverse(str));
        System.out.println(ts.reverseAndConcat(str));
        System.out.println(ts.isPalindrome("abba"));
        System.out.println(ts.movaToRight("helloworld", 2));
        System.out.println(ts.findMaxLengthString("agfhewrqweq","bsadsag", "vsda", "sdafdq"));
        System.out.println(ts.letterExistCount("this is a test of java", 'a'));
        System.out.println(ts.firstLetterToUpperCase("this is a test of java"));
        System.out.println(ts.findNumber("za10das1hjf45das7"));
    }
}
