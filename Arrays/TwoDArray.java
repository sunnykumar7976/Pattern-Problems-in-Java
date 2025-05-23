import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of Columns : ");
        int col = scanner.nextInt();
        int[][] twoDArray = new int[rows][col];
        
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                twoDArray[i][j]= scanner.nextInt();
            }
        }
        
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(twoDArray[i][j] + " ");
            }System.out.println("");
        }
        
        System.out.println("Enter the number you want to search : ");
        int x= scanner.nextInt();
        //Search number x
        for(int i=0;i<rows;i++){
            for(int j=0; j<col;j++){
                if(twoDArray[i][j] == x){
                    System.out.println("Found at " +i+","+j);
                }
            }
        }
    }
}
