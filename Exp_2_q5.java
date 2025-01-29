public class Exp_2_q5 {
     
        static int Series(int n) 
    { 
        int i; 
        int sums = 0; 
        for (i = 1; i <= n; i++) 
            sums += (i * i); 
        return sums; 
    } 
    public static void main(String[] args) 
    { 
        int n = 3; 
        int res = Series(n); 
        System.out.println(res); 


        
    }
}
