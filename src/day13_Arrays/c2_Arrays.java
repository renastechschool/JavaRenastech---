package day13_Arrays;

public class c2_Arrays {

    public static void main(String[] args) {

        //
        //declaration of array
        //DataType [] nameofyourcontainer = {data1,data2,data3, .... }

        int [] numberList={10,20,30,40};
                        // 0   1  2  3

        String [] names={"Firas","Hamsa","Meral","Suphi" };
                        //0       1       2       3

        System.out.println(names[2]); // meral
        System.out.println(numberList[3]);//40

        //print all the names from string array

        for (int i = 0 ; i <=3 ; i++){ //0 1 2 3
            String name=names[i];//0 firas
            System.out.println("Name " + i + " == " + name);
        }

        int [] numbers2= {1,2,3,4,5,10,7,8,0};
                        //0,1,2,3,4,5, 6 ,7,8

        //
        if (numbers2 [2] > numbers2 [5]){ //3 > 10
            System.out.println("2nd index number of number2 list is bigger then index number 5");
        }else{
            System.out.println("2nd index is smaller or equal to 5th index number");
        }
    }
}
