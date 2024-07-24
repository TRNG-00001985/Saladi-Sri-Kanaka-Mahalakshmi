package Revature;

import java.util.Scanner;

public class Reverse {
    public static  void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextLine());
        sb.reverse();
        System.out.println(sb);
    }
}
