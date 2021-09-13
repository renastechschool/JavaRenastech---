package day06_NestedIf_Switch;

public class c3_nestedIfPractice {

    //create a java program to check if person is eligible to give blood
    //requirement to give blood :
    //person needs to be older then 18
    //person weight needs to be more then 50

    //expected output :
    // if person age is smaller and equal to 18
    //print :"Person needs to be older then 18 "
    //if person is eleigable
    //"Person is eligible to give blood"
    //if person is not
    //"Person is not eligible to give blood "

    //example test data is person age is 15 weigth is 150
    //"Person needs to be older then 18 "
    //example test data is person age is 20 weigth is 40
    //"Person is not eligible to give blood "
    //example test data is person age is 20 weigth is 100
    ////"Person is eligible to give blood"

    //example test data is person age is 18 weigth is 55
    //"Person needs to be older then 18 "

    public static void main(String[] args) {

        String personName="Esra";
        int age= 35;
        //byte float or double
        //byte is not reasonable (beacuase weight can be more then 128 )
        //int (not usefull because it is whole number  weight can be decimal as well)
        //float and double will be okay to use
        double weight = 52.20;
        String result="";

        if (age > 18){
            if (weight > 50.0){
                result = personName + " is eligible to give blood";
            }else {
                result = personName + " is not eligible to give blood";
            }
        }else if (age <=18){
            result = personName + " needs to be older then 18 ";
        }else {
            result = " Invalid Character entered !!!!";
        }

        System.out.println(result);



    }
}
