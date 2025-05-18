package LocalRepo;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=4;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd half stars
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd half stars
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
