package Revature;

import java.util.Scanner;
public class Prime{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0) {
                count += 1;
            }
        }
        if(count==1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}



