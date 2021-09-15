package day13_Arrays;

import java.util.Arrays;

public class c5_arrays3 {

    public static void main(String[] args) {
        int [] arr=new int[3];
        //array size is fixed
        //so you will need to decleare at the begining

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
       // arr[3]=40;//ArrayIndexOutOfBoundsException: 3
        System.out.println(arr);//[I@5cad8086 hashcode it is not an error
        System.out.println(arr[0]);

        //we have a method to convert from hashcode to string and that will return you whole array
        //Arrays is librarry inside java and it has different methods
        //tostring method will ask and array and convert whole array to string
        System.out.println(Arrays.toString(arr));//[10, 20, 30]

        String []names = {"azmar","hasim" , "korkmaz" ,"shilan"};

        System.out.println(Arrays.toString(names));//[azmar, hasim, korkmaz, shilan]

        //combine 2 different array
        //list1 == 1 ,2 3,4
        //list2 == 5,6,7,8,9

        int [] list1={1,2,3,4,5,6};  //size is 6
        int [] list2={10,11,12,0,13}; // size of this one 5

        //newList size == 11

        int [] newList=new int[list1.length + list2.length];
        System.out.println(Arrays.toString(newList));
        //all list will be 0 becuase java takes 0 as default
        //11 0

        //first i will need to assign from list1 to my newlist
        for (int i =0 ; i < list1.length ; i++){ // 0 12 6
            newList[i]=list1[i];
            //newList[0]=list1[0];
            //newList[1]=list1[1];
            //newList[2]=list1[2];

            //6

        }
        System.out.println(Arrays.toString(newList));

        //second i will need to assign fromlist2 to my newlist
        ////newList[6]=list2[0];
        ////newList[7]=list2[1];
        ////newList[8]=list2[2];
        ////newList[9]=list2[3];
        ////newList[10]=list2[4];
        ////newList[11]=list2[5];
        for (int i = 0 ; i < list2.length ; i++){
            newList[list1.length +i]=list2[i];
            ////newList[6+0]=list2[0];
            ////newList[6+1]=list2[1];
            ////newList[6+2]=list2[2];
            ////newList[9]=list2[3];
            ////newList[10]=list2[4];
            ////newList[11]=list2[5];
        }
        System.out.println(Arrays.toString(newList));







    }
}
