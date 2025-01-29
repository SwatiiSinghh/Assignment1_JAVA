import java.util.Scanner;
public class Exp_2_q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int i;
        int a=0,b=1;
        int s;
        System.out.println("Fibonacci Series:");
        System.out.println(" "+a+"\n "+b);
        for(i=0;i<=n;i++){
            s=a+b;
            a=b;
            b=s;
            System.out.println(" "+s);
        }    
    }
}
