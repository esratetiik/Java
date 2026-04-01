

public class Arrays {
    
    public static void main(String[] args){

        //veriTipi diziAdi[] = new veriTipi[elemanSayisi];
        //veriTipi[] diziAdi = new VeriTipi[elemanSayisi];
        //veriTipi[] diziAdi = {v1, v2, v3};

        
        int liste[] = new int[4];
        liste[0] = 1;
        liste[1] = 2;
        liste[2] = 3;
        liste[3] = 4;

        System.out.println(liste[2]);
        int[] liste1 = {1,2,3,4,5,6};

        System.out.println();

        for (int i=0 ; i<= liste1.length;i++)
            System.out.println(liste1[i]);

         for (int value : liste){
            System.out.println(value);
        }
        System.out.println();

         
        int[][] arr = {{1,75,10},
                       {2,87,20},
                       {3,95,15}
        };
       
        
        for (int i=0; i<arr.length; i++){
            for (int k=0; k< arr[0].length; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        
         System.out.println();
        
        
        for (int[] row : arr){
            for (int value : row ){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        
       



    }
}
