public class Task2 {
    public static void main(String args[]){
        int num=0;
        for(int i=100;i<1000;i++){
            int bai = i%10;
            int shi = i%100/10;
            int ge = i/100;
            if(i == Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)){
                System.out.println(i);
                num++;
            }
        }
        System.out.println("1000以内的水仙花数有:"+num+"个");
    }
}
