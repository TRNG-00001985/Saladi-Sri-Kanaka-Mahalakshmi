package Revature;

import com.sun.tools.javac.Main;

public class SWAPNUMBERSusingBITWISE {
    public static void main(String[] args) {
        int a=9;
        int b=8;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
