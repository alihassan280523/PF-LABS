
import myPackages.Student;


public class Main{

    public static void main(String[] args){
    
        Student std1=new Student();
        Student std2=new Student("Ali Hassan",1);


        System.out.println(std1);
        System.out.println();
        std2.showDetails();

    }
}