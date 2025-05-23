import java.util.Scanner;

public class DisplayNames {
    public static void displayNames(String names[], int size){
        for(int i=0; i<size; i++){
            System.out.println("Name "+(i+1)+" is "+names[i]);
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = scanner.nextInt();
        
        System.out.println("Enter Names : ");
        String names[] = new String[size];
        
        //for input
        for(int i=0; i<size; i++){
            names[i]= scanner.next();
        }

       displayNames(names,size);
    }
}
