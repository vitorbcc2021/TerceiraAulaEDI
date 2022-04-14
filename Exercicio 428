package edidois10;
import java.util.Scanner;

public class EdiDois10 {
    public static void main(String[] args) {
        
        int qtde[][] = new int[50][3];
        int L, c, d;
        String nome[] = new String[50];
        
        
        Scanner sc = new Scanner(System.in);
        
        
        for(L=0; L<50; L++){
            
            System.out.println("\n\ndigite nome da " + (L + 1) + " planta: ");
            nome[L] = sc.next();
            
            System.out.println("\ndigite quantidade em estoque: ");
            qtde[L][0] = sc.nextInt();
            
            System.out.println("\ndigite qunatidade ideal: ");
            qtde[L][1] = sc.nextInt();
            
            
            if(qtde[L][0] < qtde[L][1]){
            
                qtde[L][2] = qtde[L][1] - qtde[L][0];
                
                } else {
                
                    qtde[L][2] = 0;
                    
                }
        }
        
        System.out.println("\nTotal de compras\n");
        
        
        for(L=0; L<5; L++){
            
            System.out.println("\n" + nome[L] + " - " + qtde[L][2]);
            
        }
        
        System.out.println();
        
    }
    
}
        
