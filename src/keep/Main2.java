package keep;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-07 16:12
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        String cost = sc.next();

        String[] days = day.split(",");
        String[] costs = cost.split(",");

        int d = Integer.valueOf(days[days.length - 1]);
        int[] dayArr = new int[d + 1];
        for (int i = 0; i < days.length; i++) {
            dayArr[Integer.valueOf(days[i])]++;
        }

        int i = 1;
        int j = 1;
        int dis = 0;
        int count = 0;
        int allCost = 0;
        while (i < dayArr.length && j < dayArr.length) {
            if (dayArr[i] == 1) {
                j++;
                count++;
                if (dayArr[j] == 1) {
                    count++;
                    dis = dayArr[j] - dayArr[i] + 1;
                }
            }
            if (dis > 0 && dis < 7) {
                for (; j < j + dis; j++) {
                    if (dayArr[j] == 1){
                        count++;
                    }
                }
            } else {
                allCost +=  Integer.valueOf(costs[0]);
            }

            if (count <= 7) {
                allCost += Integer.valueOf(costs[1]);
            }
            if (count > 7 && count <= 30) {
                allCost += Integer.valueOf(costs[2]);
            }
            i = j;
        }
        System.out.println(allCost);
    }
}
