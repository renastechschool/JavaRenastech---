package day15_ForEachLoop;

public class c6_nestedForEach {

    public static void main(String[] args) {
        int [] arr={10,5,5};
        for (int each : arr){
            System.out.println(each);
        }

        int [][] arr2d={ {1,2,3} , {4,5} ,{6,7,8,9,10}};

        for( int [] each1D : arr2d){ //this will store each child container

            for (int eachNumber : each1D){ //this will store each number from each container
                System.out.print(eachNumber+" ");
            }
        }


    }
}
