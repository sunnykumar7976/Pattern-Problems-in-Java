public class MaxMin {
    public static void main(String[] args) {
        int num[] = {11,222,3,45,6,7,8,9,87,56,0};
        int max = 0;
        int min = num[0];
        for (int i=0; i<num.length; i++){
            
            if(num[i]>max){
                max = num[i];
            }
            else if (num[i]<min){
                min = num[i];
            }
           
        }
        System.out.println("Max is : " + max);
        System.out.println("Min is : " + min);
    }
}
