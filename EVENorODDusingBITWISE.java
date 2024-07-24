package Revature;

public class EVENorODDusingBITWISE {
    public static void main(String[] args) {
         int n=6;
         if((n>>1<<1 == n)){
             System.out.println("Even");
         }else{
             System.out.println("odd");
         }
         if((n&1)==0){
             System.out.println("even");
         }else{
             System.out.println("odd ");
         }
    }
}
