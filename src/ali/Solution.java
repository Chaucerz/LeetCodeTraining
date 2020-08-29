package ali;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2020-05-11 19:09
 */
public class Solution {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //存的是*
         String splitter = sc.nextLine();
         //*后面的数据
         List<String> list = new ArrayList<>();
         while (sc.hasNextLine()){
             String str = sc.nextLine();
             if(str.isEmpty()){
                 break;
             }
             list.add(str);
         }

         List<String> result = help(splitter, list);
         System.out.println(result.size());
         for (String s :result) {
             System.out.println(s);
         }

     }

    public static List<String> help(String splitter, List<String> list) {

         List<Node> nodeList = new ArrayList<>();
         for(int i = 0; i <list.size(); i++) {
             Node node = new Node();
             String[] str = list.get(i).split(",");
             node.id = Integer.parseInt(str[0]);
             node.name = str[1];
             nodeList.add(node);
         }

         List<String> result = new ArrayList<>();

         int index = 0;
         String s = "";
         for(int i = index; i < nodeList.size(); i++) {

             if(splitter.equals(nodeList.get(i).name)== false) {
                 s += list.get(i)+ "|";
             } else {
                 s = s.substring(0, s.length() - 1);
                 result.add(s);

                 index = i + 1;
             }


             }
            return result;


    }
}
