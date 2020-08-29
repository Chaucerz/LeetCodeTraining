package zte;

import java.util.ArrayList;

/**
 * @author Chaucer
 * @date 2019-09-09 11:00
 */
public class Solution {

    public int calculateMaxOil(int numNodes, int sourceNode,
                               ArrayList<ArrayList<Integer>> network) {
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < network.size(); i++) {
            if (network.get(i).get(0) == sourceNode) {
                int secondNum = network.get(i).get(1);
                int thirdNum = network.get(i).get(2);
                int min = thirdNum;
                for (int j = i + 1; j < network.size(); j++) {
                    if (network.get(j).get(0) == secondNum) {
                        flag = true;
                        if (network.get(j).get(2) < min) {
                            min = network.get(j).get(2);
                        }
                    }
                }
                if (!flag){
                    sum += thirdNum;
                } else {
                    sum += min;
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int numNodes =7;
        int sourceNode = 1;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(60);
        res.add(new ArrayList<>(list));
        list.clear();
        list.add(1);
        list.add(3);
        list.add(40);
        res.add(new ArrayList<>(list));
        list.clear();
        list.add(2);
        list.add(4);
        list.add(20);
        res.add(new ArrayList<>(list));
        list.clear();
        list.add(2);
        list.add(5);
        list.add(40);
        res.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(6);
        list.add(25);
        res.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(7);
        list.add(15);
        res.add(new ArrayList<>(list));
        list.clear();
        int i = new Solution().calculateMaxOil(numNodes, sourceNode, res);
        System.out.println(i);
    }
}
