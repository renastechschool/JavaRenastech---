package day15_ForEachLoop;

import java.util.Arrays;

public class c2_multipleDimensionArray {

    public static void main(String[] args) {
        //declaration of array
        //1 dimension array
        //Datatype [] name = { data1,data2 ,data3}
        //2 dimension array
        //Datatype [][] name =
        // {
        //      { data1,data2 ,data3},
        //      { data1,data2  },
        //      { data1,data2 ,data3}
        //      { data1,data2 ,data3}
        // }

        //1 dimension array
        int [] arr= {1,2,3,4,5};
        System.out.println("arr 1D :" + arr.length); //5

        int [][] arr2= {         {1,2,3} ,{0,2,4 } , {2,4} };
        //conteeiner indexes         0    ,    1    ,   2
        //index for each number //0 1 2   , 0 1 2   , 0 1
        System.out.println("arr 2d :"+arr2.length); //3

        System.out.println(arr[3]);

        //arr2 [2][1]
        //first bracket [] is alwasys container number
        //second one index number of your variable

        //second from from last container
        System.out.println(arr2[2][1]);
        //first 4 from middle container
        System.out.println(arr2[1][2]);

        System.out.println("++++++++++++");
        //this will give you specific length of container
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);
        //System.out.println(arr2[3].length); out of index

        //if i want to print all the numbers from specific container
        int [] container0=arr2[0]; // 1 ,2 ,3
        System.out.println(Arrays.toString(container0));

        System.out.println("==============");
                                //0       1         2       3         4          0     1        2       3
        String [][] nameList={ {"Ridvan","Recep","Bawer","ibrahim","suphi"} , {"Ozge","Meral","esra","ceren"} };
                            //                0                              ,               1

        String nameEsra=nameList[1][2];
        String nameSuphi=nameList[0][4];

        String [] maleNames=nameList[0];
        String [] femaleNames=nameList[1];

        System.out.println(nameSuphi);
        System.out.println(Arrays.toString(femaleNames));


//        int [][][] number3d= {
//                { {1,2,3} , {4,5} } ,
//                { {6 } , {7} }  ,
//                { {8} }
//        };

        int [][][] number3d= {  { {1,2,3} , {4,5} } , { {6 } , {7} }  , { {8} } };
                            //  0                   , 1               , 2
                            //     0      , 1       ,   0     ,  1     ,  0
                            //    {0,1 ,2 } , {0,1} ,   0     ,  0     ,   0

        System.out.println(number3d[0][0][0]);//1
        System.out.println(number3d[1][0][0]);//6
        System.out.println(number3d[0][1][1]);//5
        System.out.println(number3d[2][0][0]);//8






    }
}
