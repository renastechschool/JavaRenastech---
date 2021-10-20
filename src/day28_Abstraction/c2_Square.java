package day28_Abstraction;

public class c2_Square extends Shape{
    //if i extend parent class that has abstract method
    //those methods need to overriden otherwise your class will give you error

    //shapeName , length
    public final String shapeName="Square";
    public double length;

    public c2_Square(double length){
        this.length=length;
    }

    @Override
    public void shapeName(){
        System.out.println("shapeName = " + shapeName);
    }
    @Override
    public void shapeArea(){
        double area = length * length;
        System.out.println("Area of "+shapeName + " is : " + area);
    }
    //as soon as i override abstract methods error will be dissapear

}


//Shape parent
//rectangele child
//rectype1 rectype2