package Revature;

public class GetMaxGetMin {
    public static void main(String[] args) {
        int [] a={34,1,2,-1,3,4,6};
        int max=a[0];
        int min=a[0];
        for (int i=0;i<a.length;i++){
                if(a[i]<min){
                    min=a[i];
                }
                if(a[i]>max){
                    max=a[i];
                }
        }
        System.out.println("Minimum number" +min);
        System.out.println("Maximum number"+max);
    }
}
