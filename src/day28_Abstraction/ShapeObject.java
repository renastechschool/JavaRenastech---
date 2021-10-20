package day28_Abstraction;

public class ShapeObject {

    public static void main(String[] args) {

        c1_Rectangle obj=new c1_Rectangle(5,7);
        //area 5 * 7 =35
        obj.shapeName();
        obj.shapeArea();

        c1_Rectangle obj2 = new c1_Rectangle(3,8);
        obj2.shapeName();
        obj2.shapeArea();

        c2_Square obj3=new c2_Square(5);
        //area of square is length * length 25
        obj3.shapeName();
        obj3.shapeArea();
    }
}
