package day30_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class c2_Quee {

    //  //        Queue<String> q=new Queue<String>();  Quee is interface
    //    //   Queue(I):
    //    does not have index number ,
    //    size dynamic ,
    //    it accepts duplicates,
    //    first in first out order.
    //    Pool() Poll(): removes the first object in the queue.

    public static void main(String[] args) {
        Queue<Integer> numbers=new PriorityQueue<>();
        //FIFO
        //it will sort in quee logic
        //it is not always going to sort from small to large
        //it has own sort logic

        numbers.add(20);
        numbers.add(20);
        numbers.add(1);
        numbers.add(11);
        numbers.add(200);
        numbers.add(15);
        numbers.add(3);


        System.out.println(numbers);//[1, 11, 3, 20, 200, 20, 15]

        Integer number=numbers.poll(); // no index in quee it is going to pool first in number (FIFO)
        System.out.println("number = " + number);
        System.out.println(numbers);


    }
}
