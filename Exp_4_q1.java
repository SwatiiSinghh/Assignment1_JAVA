public class Exp_4_q1 {
     static int c = 0;
    Exp_4_q1(){
        c=c+1;
    }
  
    public static void main(String[] args) {
        
       Exp_4_q1 co1=new Exp_4_q1();
       Exp_4_q1 co2=new Exp_4_q1();
       Exp_4_q1 co3=new Exp_4_q1();

        System.out.println("Number of objects created: " + c);
    }
}
