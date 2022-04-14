package edidois9;
import java.util.Scanner;

public class EdiDois9 {

    public static void main(String[] args) {
        int A[][] = new int[4][4];
        int B[][] = new int[4][4];
        int SOMA [][] = new int[4][4];
        int L,c;
        
        Scanner sc = new Scanner(System.in);
        
        for(L = 0; L < 4; L++){
            
            for(c = 0; c < 4; c++){
            
                System.out.println("digite elemento de A[" + (L+1) + " ][" + (c+1)+ "]: ");
                A[L][c] = sc.nextInt();
            }
        
        }
        for(L = 0; L < 4; L++){
            
            for(c = 0; c < 4; c++){
                
                System.out.println("digite elemento de B[" + (L+1) + "][" + (c+1) + "] : ");
                B[L][c] = sc.nextInt();
                
                SOMA[L][c] = A[L][c] + B[L][c];
            }
        }
        System.out.print("\n\tMATRIZ SOMA\n");
        for(L = 0; L<4; L++){
            
            for(c = 0; c<4; c++)
                System.out.print("/t" + SOMA[L][c] + " ");
            
            System.out.println();
        }
        System.out.println();
    }
    
}
