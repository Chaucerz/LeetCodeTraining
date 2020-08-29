package cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaucer
 * @date 2020-03-20 20:04
 */
public class HappyCinema {
    public static void main(String[] args) {
        List<Integer> available =new ArrayList<>();
        available.add(1);
        available.add(2);
        available.add(3);
        available.add(4);
        available.add(6);
        available.add(7);
        List<Integer> seats1=new ArrayList<>();
        seats1.add(1);
        seats1.add(2);
        List<Integer> seats2=new ArrayList<>();
        seats2.add(5);
        seats2.add(6);

        Cinema cinema=new Cinema(available,"朱美琪的快乐影院");

        Person person=new Person(cinema,seats1,"朱美琪");
        Person person1=new Person(cinema,seats2,"乔治");
        person.start();
        person1.start();


    }
}
