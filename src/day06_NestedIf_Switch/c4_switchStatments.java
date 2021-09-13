package day06_NestedIf_Switch;

public class c4_switchStatments {

    //create a java program that will take numbers between 1-12
    //and print months name depends on number
    //ex
    //1 -- jan
    //5 -- may

    public static void main(String[] args) {
        int number=12;
        String  monthName ;

        switch (number){//swtich will ask you to pass a variable that will might have different cases
            case 1 :monthName="Jan"; //swtich will check number and if it matches with the case = 1
                // it will make month name as a Jan
                break; //break will break all switch after catching the matching case number
            case 2 : monthName="Feb";
                break;
            case 3 : monthName="March";
                break;
            case 4 : monthName="Apr";
                break;
            case 5 : monthName="May";
                break;
            case 9 : monthName ="Sep";
                break;
            case 6 : monthName ="Jun";
                break;
            case 7 : monthName ="July";
                break;
            case 8 : monthName ="Aug";
                break;
            case 10 : monthName ="Oct";
                break;
            case 11 : monthName ="Now";
                break;
            case 12 : monthName ="Dec";
                break;
            default: monthName = " Invalid number entered Please check number";
                //break; optinal to use because we dont have any case left

        }

        System.out.println(monthName);

        char letter='b';
        String result = "Hello ";
        //3 casse with a b c
        //if the case is a result should be Hello a
        //if the case is b result should be Hello b
        //if the case is c result should be Hello c
        //if letter is something else then Hello Invalid.

        //result = "asdas"  this is how you reassigned the variable
        //if you want to add something to your variable and same time keep what you have
            //you will either do result = result + "a"; //hello a
            //or shortcut result += "a" ; //hello a

        switch (letter){

            case 'a' :
                result += "a"; //result = result + "a";

            case 'b' :
                result += "b"; //result= hello b

            case 'c':
                result += "c"; //hello bc

            default:
                result += "Invalid";

        }
        System.out.println(result);

        //in the switch first it will ceheck matching case
        //an then it will excute all lines after your case gets break


    }
}
