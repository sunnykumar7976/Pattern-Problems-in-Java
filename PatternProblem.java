package LocalRepo;

public class PatternProblem {
    public static void main(String[] args) {
        int n=5;
        //out loop
        for(int i =1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j= 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
