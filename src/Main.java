import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Aquarium aquarium = new Aquarium();
        aquarium.start();
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(10);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(3);

        /*for(int n: numbers){
            if(n == 3){
                numbers.remove(n);
            }
        }*/
       /* Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n == 3) {
                iterator.remove();
            }
        }*/

       /* Thread t1 = new Thread() {
            @Override
            public void run() {
                Iterator<Integer> iterator = numbers.iterator();
                while (iterator.hasNext()) {
                    int n = iterator.next();
                    if (n % 2  == 0) {
                        synchronized (numbers){
                            iterator.remove();
                        }
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                Iterator<Integer> iterator = numbers.iterator();
                while (iterator.hasNext()) {
                    int n = iterator.next();
                    if (n % 3  == 0) {
                        synchronized (numbers){
                            iterator.remove();
                        }
                    }
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(numbers);*/
    }
}