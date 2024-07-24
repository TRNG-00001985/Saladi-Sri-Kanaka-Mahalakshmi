package Revature;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] a=new int[4];
        float sum=0;
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum/a.length);
    }
}
