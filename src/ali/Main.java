package ali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2020-05-20 19:21
 */
public class Main {
    private static  int MAX_NODE_COUNT = 10;
    private static List<String> nodes= new ArrayList<String>();
    private static int[][] adjacencyMatrix = new  int[MAX_NODE_COUNT][MAX_NODE_COUNT];

    private static int addNode(String nodeName){
        if(!nodes.contains(nodeName)) {
            if(nodes.size()>=MAX_NODE_COUNT) {
                System.out.println("nodes超长:"+nodeName);
                return -1;
            }
            nodes.add(nodeName);
            return  nodes.size()-1;
        }
        return nodes.indexOf(nodeName);
    }

    public static void addLine(String startNode, String endNode){
        int startIndex = addNode(startNode);
        int endIndex = addNode(endNode);
        if(startIndex>=0&&endIndex>=0) {
            adjacencyMatrix[startIndex][endIndex] = 1 ;
        }
    }

    public static List<String>  find() {
        // 从出发节点到当前节点的轨迹
        List<Integer> trace =new ArrayList<Integer>();
        //返回值
        List<String> reslut = new ArrayList<>();
        if(adjacencyMatrix.length>0) {
            findCycle(0, trace,reslut);
        }
        if(reslut.size()==0) {
            reslut.add("no cycle!");
        }
        return reslut;
    }

    private static void findCycle(int v,List<Integer> trace,List<String> reslut)
    {
        int j;
        //添加闭环信息
        if((j=trace.indexOf(v))!=-1) {
            StringBuffer sb = new StringBuffer();
            String startNode = nodes.get(trace.get(j));
            while(j<trace.size()) {
                sb.append(nodes.get(trace.get(j)));
                j++;
            }
            reslut.add(sb.toString());
            return;
        }
        trace.add(v);
        for(int i=0;i<nodes.size();i++){
            if(adjacencyMatrix[v][i]==1) {
                findCycle(i,trace,reslut);
            }
        }
        trace.remove(trace.size()-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] cycle = string.split(";");
        for(int i = 0; i < cycle.length; i++) {

            Main.addLine(""+ cycle[i].charAt(0),""+cycle[i].charAt(cycle[i].length()-1));
        }

        List<String> result = Main.find();
        String res = result.get(0);
        if (res.equals("-")){
            System.out.println(res);
        }else {
            System.out.println(res);
        }

    }


}
