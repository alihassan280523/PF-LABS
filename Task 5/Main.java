import myPackages.*;

public class Main{

    public static void main(String[] args){

       Employee emp1=new Employee(); 
       Employee emp2=new Employee(1);
       Employee emp3=new Employee(2,"Ali");
       Employee emp4=new Employee(3,"Hassan",500);

       System.out.println("Employee 1: "+emp1.toString());
       System.out.println("Employee 2: "+emp2.toString());
       System.out.println("Employee 3: "+emp3.toString());
       System.out.println("Employee 4: "+emp4.toString());
    }
}