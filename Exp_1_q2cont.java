public class Exp_1_q2cont {
    public static void main(String[] args) {

                int a = 5;
                int b = 10;
                
                System.out.println("Before swap: a = " + a + ", b = " + b);
                
                // Swapping without using a third variable
                a = a + b; // a now becomes 15
                b = a - b; // b now becomes 5
                a = a - b; // a now becomes 10
                
                System.out.println("After swap: a = " + a + ", b = " + b);
            }
        }
        
    

