class Person {
    String name;
    int age;
    {
        name = "Dhoni";
        age = 43;
    }

    public Person() {
       
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class q5 {
    public static void main(String[] args) {
        Person p1 = new Person(); 
        Person p2 = new Person("Virat", 37); 
        p1.display();
        p2.display();
    }
}



