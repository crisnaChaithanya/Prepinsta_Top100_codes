import java.util.Scanner;

public class PosOrNeg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();

        sc.close();
    }
    static String checkUsingIfElse(int n){
        if(n>0){
            return "Positive" ;
        }
        else if(n<0){
            return "Negative" ;
        }
        else {
            return "Zero";
        }
    }
    static String usingTernary(int n){
        return (n>0)? "positve" : ((n<0)? "negative" : "zero") ;
    }
}