package edidois7;
import  java.util.Scanner;

public class EdiDois7 {
    public static void main(String[] args) {
        int N[][] = new int[10][10];
        int L, c, t;
        
        Scanner sc = new Scanner(System.in);
        
        for(L = 0; L < 9; L++){
            
            for(c = 0; c <= 9; c++){
                System.out.println("\nEntre com elemento linhab" + (L + 1) + "b-hcolunab " + (c + 1) );
                N[L][c] = sc.nextInt();
            }
        }
        
        System.out.println("\nACIMA DA DIAGONAL PRINCIPAL\n");
        
        for(L = 0;L <= 8;L++){

            for(c = L+1; c <= 9; c++){
                System.out.println(N[L][c]);
            }
            
            System.out.println();
            
            for(t = 0; t <= L; t++){
                System.out.println("\t");
            }
            
        }
        
        System.out.println();
        
    }
    
}
