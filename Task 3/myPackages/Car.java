package myPackages;

public class Car{

    private String brandName;
    private String model;

    public Car(String brand,String model){
        this.brandName=brand;
        this.model=model;

    }

    public void start(){
        System.out.println(this.brandName+" "+this.model+" has started");
    }

    
}