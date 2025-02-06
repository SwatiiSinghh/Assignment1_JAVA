public class Circle {
  private double r;
  public Circle(double r){
    this.r=r;
  }
    public double area(){
        
        return 3.14*r*r;
    }
    public double circum(){
        
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Circle Circle=new Circle(5);
        double a=Circle.area(); 
        double c=Circle.circum(); 
        System.out.println("Area="+a);
        System.out.println("Circumference="+c);
        
    }
}
