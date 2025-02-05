import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Array:");
        for(int i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }  
        int minProduct = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = a[i] * a[j];
                if (product < minProduct) {
                    minProduct = product;
                }
            }
        } 
        System.out.println("Minimum Product="+minProduct);     
    }
}
