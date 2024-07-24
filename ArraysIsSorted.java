package Revature;

public class ArraysIsSorted {
    public static void main(String[] args) {
        boolean isSorted=true;
        int [] a={1,2,3,4,5,0};
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
