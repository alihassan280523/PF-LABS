package myPackages;

public class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(){
        id=0;
        name="";
        salary=0;
    }

    public Employee(int id){
        this.id=id;
        this.name="";
        this.salary=0;
    } 

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "ID: "+this.id+"\nName: "+this.name+"\nSalary: $"+this.salary;
    }
}