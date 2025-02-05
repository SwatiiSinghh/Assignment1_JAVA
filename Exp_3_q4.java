import java.util.Scanner;
public class arr {
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
        int j = 0; 
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
            a[j++] = a[i];
            }
        }
        while (j < n) {
        a[j++] = 0;
        }
        System.out.println("Array:");
        for(int i=0;i<n;i++){
        System.out.println(" "+a[i]);
        }
    }
}
