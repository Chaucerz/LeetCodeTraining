package cinema;

import java.util.List;

/**
 * @author Chaucer
 * @date 2020-03-20 20:04
 */
class Cinema extends Thread{
    List<Integer> available;
    String name;

    public Cinema(List<Integer> available, String name) {
        this.available = available;
        this.name = name;
    }

}
