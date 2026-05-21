package myPackages;

public class Student{
    private String name;
    private int id;

    public Student(){
        name="abc";
        id=-1;
    }

    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void showDetails(){
        System.out.println("Name: "+name+"\nID: "+id);
    }

    public String toString(){

        return "Name: "+name+"\nId: "+id;
    }
}