package day03_variablesContinue;

public class c7_postPreConditions {

    public static void main(String [] args){
        int x = 10; // post pre condtions will effect this number

        System.out.println(x); // 10
        //pre condtion
        System.out.println(++x);//pre condition will increase your number by one immediately //11
        System.out.println(x);//11

        System.out.println(+x);// one plus wont add anything it will effect number if possitive or negative

        int y=20;
        System.out.println(y);
        System.out.println(y++);//post condition will increase the number on next step
        System.out.println(y);

        // pre : this will change the value of number immediately
        // post : first wont gonna change anyhting on the variable , at the end it will change it

        x = x + 5;

    }
}

