package day28_Abstraction;

public class c1_Rectangle extends Shape {

    //since we extended abstract class that has abstract methods
    //and since abstract method doesnt have body
    //java is telling us to override abstract methods

    //below method will be inherited
    //shapeArea , shapeName

    public final String shapeName="Rectangle"  ;
    public double width;
    public double length;

    public c1_Rectangle(double width , double length){
        this.width=width;
        this.length=length;
    }


    @Override
    public void shapeArea(){
        //rectange area = width * length
        double area = width * length;
        System.out.println("Area of " + shapeName + " is : " + area);
    }
    @Override
    public void shapeName(){
        System.out.println("shapeName = " + shapeName);
    }

}
