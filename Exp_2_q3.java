import java.util.Scanner;
public class Exp_2_q3 {
    public static void main(String[] args) {
        int i=2;
    boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        
        if(n==0||n==1){
            flag=true;
        }
        while(i<=n/2){
            if(n%i==0){
                flag=true;
                break;
            }
            else{
                ++i;
            }
        }
        if(flag==false){
            System.out.println("Prime Number");

        }
        else{
            System.out.println("Not Prime");
        }
    }
}

