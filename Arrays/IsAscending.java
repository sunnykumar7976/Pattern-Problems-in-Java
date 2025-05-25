import java.util.Scanner;

public class IsAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the values in the array : ");
        //input
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        
        // To search for ascesnding order
        boolean b = true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                b= false;
            }
        }
        if(b== true){
            System.out.println("is in ascending order");
        }
        else{
            System.out.println("not in ascending order");
        }
    }
}
