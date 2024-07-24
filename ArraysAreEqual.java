package Revature;

import java.util.Arrays;
public class ArraysAreEqual {
    public static void another_way(){
        int [] a={1,2,3,4,5};
        int [] b={1,2,3,4,5};
        System.out.println(Arrays.equals(a,b));
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int [] b={1,2,3,4,5};
        boolean isequal=true;
        if(a.length!=b.length){
            System.out.println("Not Equal");
        }else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    isequal=false;
                    break;
                }
            }
        }
        if(isequal){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        another_way();
    }
}
