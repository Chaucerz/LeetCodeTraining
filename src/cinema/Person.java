package cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaucer
 * @date 2020-03-20 20:05
 */
class Person extends Thread{
    Cinema cinema;
    List<Integer> seats;
    String name;
    List<Integer> avail = new ArrayList<>();

    public Person( Cinema cinema, List<Integer> seats, String name) {
        this.cinema = cinema;
        this.seats = seats;
        this.name = name;
    }

    public void run() {
        synchronized (cinema) {

            boolean flag = BookTickets(cinema.available, seats);
            if (flag) {
                System.out.println(name + "订购成功" + seats + "剩余" + avail);

            } else {
                System.out.println(name + "订购失败");
            }
        }
    }
    boolean BookTickets(List<Integer> available,List<Integer> seats){
        List<Integer> copy=new ArrayList<>();
        copy.addAll(available);
        copy.removeAll(seats);
        if (available.size() - copy.size() == seats.size()){
            avail=copy;
            return  true;
        } else {
            return false;
        }
    }
}