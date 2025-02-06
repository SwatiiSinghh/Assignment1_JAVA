public class Employee {
    String n;
    int jd;
    double sal;
    String add;
    public Employee(String n, int jd, double sal, String add){
        this.n=n;
        this.jd=jd;
        this.sal=sal;
        this.add=add;
    }
    public void Display(){
        System.out.print(n+"\t      "+jd+"              \t"+sal+"          \t"+add);
    }
    public static void main(String[] args) {
        Employee details=new Employee("Ujjwal", 2024, 50000, "BBS");
        Employee details1=new Employee("Ravi", 2023, 75000, "KUR");
        System.out.println("Employee Details");
        System.out.println("---------------------");
        System.out.println("Name \t Year of Joining \t Salary of Employee \t Address of Employee");
        details.Display();
        System.out.println();
        details1.Display();
        
    }
}

