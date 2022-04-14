package edidois12;
import java.util.Scanner;

public class EdiDois12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n[][] = new int [5][5];
        int L, c;
        for(L = 0; L < 5; L++){
            
            for(c = 0; c < 5; c++){
    
                System.out.println("digite elemento de N[" + (L+1) + "][" + (c+1) + "]");
                n[L][c] = sc.nextInt();
                
                //Entra com o número da coluna
                
                System.out.println("\nDigite número da coluna(1-5) ou —999 para acabar: ");
                c = sc.nextInt();
                
                while( c != -999 ){
                
                    while( c < 1 || c > 5 ){
                        
                        System.out.println("\nDigite número da coluna entre 1 - 5: ");
                        c = sc.nextInt();
                    }
                    
                    c = c-1;
                    System.out.println("\n Coluna: " + (c + 1));
                    
                    for(L = 0; L < 5; c++){
                        System.out.println(n[L][c]);
                    }
                }
                
                System.out.println("\nDigite número da coluna(1-5) ou —999 para acabar: ");
                c = sc.nextInt();
        }
            System.out.println();
    }
    
    }
}
