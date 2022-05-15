package edidois14;
import java.util.Scanner;

public class EdiDois14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int mat[][] = new int[5][5];
        int a[] = new int[5];
        int b[] = new int[5];
        int maior, menor, cont, x, y;
        
        for( x = 0; x < 5; x++){
            
            for( y = 0; y < 5; y++){
                System.out.println("\ndigite elemento " + (x + 1) + "-" + (y + 1) + ": ");
                mat[x][y] = sc.nextInt();
            }
            
        }
        
        /* trecho de selecao dos menores e maiores elementos das colunas */
        
        for( y = 0; y < 5; y++){
            maior = mat[0][y];
            menor = mat[0][y];
        
            for( x = 0; x < 5; x++){
            
                if(mat[x][y] > maior){
                
                maior = mat[x][y];
                
            } else {
                
                if(mat[x][y] < menor){
                    menor = mat[x][y];
                }
            }
        }
        
        a[y] = maior;
        b[y] = menor;
        
        }
        
        System.out.println("\nToda a matriz\n");
        
        for( x = 0; x < 5; x++){
           
            for( y = 0; y < 5; y++){
                System.out.print(mat[x][y] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMaiores elementos das colunas\n");
        
        for( y = 0; y < 5; y++){
            System.out.print(a[y] + "\t");
        }
        
        System.out.println("\n\nMenores elementos das colunas");
        
        for( y = 0; y < 5; y++){
            System.out.print(b[y] + "\t");
        }
        
        System.out.println("\n\n Exibindo o resultado");
        
        for( y = 0; y < 5; y++){
        
            System.out.println((a[y] + b[y])/2);
        
        }
    
    }
}
