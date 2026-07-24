import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("formula sum: " + SumFormula(n));
        System.out.println("recursion sum: " + RecursionWay(n));
    }
    static int UsingForLoop(int n){
        int sum = 0 ;
        for(int i=1 ; i<=n ;i++){
            sum += i ;
        }
        return sum ;
    }
    static int SumFormula(int n){
        return (n * (n + 1)) / 2 ;
    }
    static int RecursionWay(int n){
        if(n<=1){
            return n ;
        }
        return n + RecursionWay(n-1) ;
    }
}
