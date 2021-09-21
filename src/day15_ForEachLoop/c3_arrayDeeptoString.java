package day15_ForEachLoop;

import java.util.Arrays;

public class c3_arrayDeeptoString {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println(Arrays.toString(number));

        //2D
        int[][] number2D = {{1, 2}, {2, 3, 4}, {4}};
        System.out.println(Arrays.toString(number2D));//hashtag  [[I@5cad8086, [I@6e0be858, [I@61bbe9ba]
        System.out.println(Arrays.toString(number2D[0]));//one container [1, 2]
        System.out.println(Arrays.deepToString(number2D));//[[1, 2], [2, 3, 4], [4]]

    }
}
