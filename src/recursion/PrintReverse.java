package recursion;

public class PrintReverse {

    private static void printReverse(char[] str){
        helper(0,str);
    }

    private static void helper(int index, char[] str){
        if(str == null || index >= str.length){
            return ;
        }
        helper(index + 1, str);
        System.out.println(str[index]);
    }

    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        printReverse(c);
    }
}
