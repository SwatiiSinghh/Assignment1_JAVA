import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,k,p=0;
        System.out.println("Enter the array Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Array:");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        for(int i=0;i<n;i++){
            k=a[p];
            if(k==a[i]){
                c=c+1;
                System.out.println("\nFrequency of "+a[i]+"="+c);
            }
            ++p;
            c=0;
            
        }
        sc.close();
    }
}
