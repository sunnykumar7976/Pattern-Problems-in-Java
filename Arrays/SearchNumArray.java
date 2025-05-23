package LocalRepo.Arrays;

import java.util.*;

public class SearchNumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int m = scanner.nextInt();
        int arr[] = new int[m];
        System.out.println("Enter the values of array");
        //Input
        for(int i=0; i<m; i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Enter the number you want to search : ");
        int num = scanner.nextInt();

        for (int i=0;i<m;i++){
            if (arr[i]== num){
                System.out.println("Your number is on "+ i+"th Location");
            }
        }

    }
}
