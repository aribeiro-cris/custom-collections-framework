package Test;
import Implementations.QueueImp;

public class QueueTest {

    public static void main(String[] args) {

        QueueImp queue = new QueueImp<>();
        //Testing isEmpty
        System.out.println(queue.isEmpty());
        //Testing add
        System.out.println(queue.add(12));
        System.out.println(queue.add(3));
        System.out.println(queue.add(34));
        System.out.println(queue.add(6));
        System.out.println(queue.add(90));
        //Testing isEmpty
        System.out.println(queue.isEmpty());
        //Testing size
        System.out.println(queue.size());
        //Testing contains
        System.out.println(queue.contains(3));
        //Testing peek
        System.out.println(queue.peek());
        //Testing pool
        System.out.println(queue.poll());
        //Testing contains again
        System.out.println(queue.contains(12));
        //Testing clear
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
