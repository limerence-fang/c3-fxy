import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("移动的数组长度为:");
        int n = in.nextInt();
        System.out.println("请输入数组：");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int[] temp = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                temp[i-sum] = nums[i];
            }else{
                temp[i] = 0;
                sum++;
            }
        }
        System.out.println("移动后的数组为："+Arrays.toString(temp));
    }
}
