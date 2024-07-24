package Revature;

public class StringOperations {
    public static void main(String[] args) {
        String s="Revature Training Program";
        System.out.println(s.contains("Program"));
        System.out.println(s.indexOf('a'));
        if(s.contains("Training")){
            System.out.println("It Contains : False");
        }else{
            System.out.println("It does not contains : True");
        }
    }
}
