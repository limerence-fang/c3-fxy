import java.util.Scanner;

public class Task3 {
    static String Back(String s){
        char[] arrayy = s.toCharArray();
        int first = 0;
        int last = arrayy.length - 1;
        while(first<last){
            char temp = arrayy[first];
            arrayy[first] = arrayy[last];
            arrayy[last] = temp;
            first++;
            last--;
        }
        return new String(arrayy);
    }
    public static void main(String args[]){
        System.out.print("请输入需要倒序的字符串:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = Back(s);
        System.out.println("输出："+s);
    }
}