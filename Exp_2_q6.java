import java.util.Scanner;
public class Exp_2_q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int n=sc.nextInt();
        int i,j,k=1;
        System.out.println("Pattern: ");
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+k);
                ++k;
            }
            System.out.println("");
        }
        sc.close();
    }
}
