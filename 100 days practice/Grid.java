import java.util.Scanner;

public class Grid {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = Inp.nextInt();
        System.out.println("Enter the number of columns");
        int columns = Inp.nextInt();
        int[][] grid=new int[rows+1][columns+1];
        //Base case why we dont give as
        //grid[1][1]=1,grid[1][2]=1,grid[1][3]=1 this is reason beacuse if the row and columns size differ array index out of bound exception will throw
        for(int i=1;i<=rows;i++) grid[1][i]=1;
        for(int j=1;j<=columns;j++) grid[j][1]=1;
        //process for the remaining cells
        for(int i=2;i<=rows;i++){
            for(int j=2;j<=columns;j++){
                grid[i][j]=grid[i][j-1]+grid[i-1][j];
            }
        }
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=columns;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Number of ways to reach the Bottom right corner:"+grid[rows][columns]);
    }
}
