import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
    }
    static String bruteForce(int n){
        if(n % 2 == 0) return "Even" ;
        else{
            return "Odd" ;
        }
    }
    static String Ternary(int n){
        return (n%2 == 0)? "Even" : "Odd" ;
    }
    static String bitwise(int n){
        return (n&1)==1 ? "Odd" : "Even" ;
    }
}
