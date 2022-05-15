package edidois8;
import java.util.Scanner;

public class EdiDois8 {

    public static void main(String[] args) {
        int n[][] = new int [5][5];
        int L, c, t;
                
         Scanner sc = new Scanner(System.in);
                
        for(L=0; L<5; L++){
            for( c=0 ; c<5 ; c++){
                
                System.out.println("\ndigite elemento " + (L+1) + " - " + (c+1) +" ");
                n[L][c] = sc.nextInt();
            }
        }
        System.out.println("\nToda a matriz\n");
        
        for(L=0; L<5; L++){
            
            for(c=0;c<5;c++){
                
                System.out.print(n[L][c] + "\t");
                
            }
            
            System.out.println();
        }
        System.out.println("\nSo os elementos nas posicoes cuja linha mais coluna resulta num par \n");
        for(L = 0; L < 5; L++){
            for(c=0; c<5; c++){
                if( (L + c) % 2 == 0){
                    System.out.println(n[L][c]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
