import java.util.Random;
import java.util.Scanner;



public class MayinTarlasi{

    int rows, cols,size ;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MayinTarlasi(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.map = new int[rows][cols];
        this.board = new int[rows][cols];
        this.size = rows*cols;
    }

    public void print(int[][] arr) {
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                if(arr[i][j] >= 0) 
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void prepareGame(){
        int randRow, randCol, count=0; 
        while(count != (size/4)){
            randRow = rand.nextInt(rows); //rastgele bir şekilde mayın konulacak satır ve sütunlar belirlenir
            randCol = rand.nextInt(cols);

            if(map[randRow][randCol] != -1){ // eğer orada daha önceden mayın yoksa
                map[randRow][randCol] = -1; // oraya mayın eklenir.
                count ++;
            }
        }

    }

    public void run(){
        int row,col, success = 0;
        prepareGame();
        //print(map);
        System.out.println("Oyun başladı.");
        while(game) {
            print(board);
            System.out.println("Satır: ");
            row = scan.nextInt();
            System.out.println("Sütun: ");
            col = scan.nextInt();

            if (row<0 || row >= rows) {
                System.out.println("Geçersiz koordinat");
                continue;
            }
            if (col<0 || col >= cols) {
                System.out.println("Geçersiz koordinat");
                continue;
            }
            if (board[row][col] != 0) {
                System.out.println("Bu koordinatı daha önce açtınız, başka bir yer seçin!");
                continue;
            }

            if(map[row][col] != -1){
                check(row, col);
                success ++;
                if(success == ( size- (size/4))){
                    System.out.println("Hiç bir mayına basmadınız. Tebrikler!");
                    break;
                }
            }else {
                game = false;
                System.out.println("Game Over!");
            }
        
        }
    }

    public void check (int r, int c){
        if(map[r][c] ==0){
            if((c<cols-1) && (map[r][c+1] == -1))
                board[r][c] ++;
            if((r<rows-1) && (map[r+1][c] == -1))
                board[r][c] ++;
            if((r>0) && (map[r-1][c] == -1))
                board[r][c] ++;
            if((c>0) && (map[r][c-1] == -1))
                board[r][c] ++;
            if (board[r][c] == 0)
                board[r][c] = -2;
        }
        
    }

}
