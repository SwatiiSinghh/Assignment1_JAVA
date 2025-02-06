public class Invoice {
    int id;
    String des;
    int q;
    double p;
    public Invoice(int id, String des, int q, double p)
    {
        this.id=id;
        this.des=des;
        this.q=q;
        this.p=p;
    }
    public void Display(){
        
        System.out.println(id+"\t           "+des+"\t                    "+q+"\t              "+p);
    }
    public static void main(String[] args) {
       Invoice det=new Invoice(101, "TEA", 1, 150);
       System.out.println("INVOICE");
       System.out.println("------------------");
       System.out.println("ID\t       Description\t        Quantity\t      Price");
       det.Display();
       
    }
}