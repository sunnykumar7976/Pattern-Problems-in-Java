package LocalRepo;

public class Main {
    public static void main(String[] args) {
        int n=5;
        //uper half
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
        //Lower half
        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
    }
}
