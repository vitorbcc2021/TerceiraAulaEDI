package edidois13;
import java.util.Scanner;

public class EdiDois13 {
    public static void main(String[] args) {
        float mat[][] = new float [12][4];
        float totalMes, totalAno, totalSem;
        int i, j;
        
        Scanner sc = new Scanner(System.in);
        
        for( i = 0; i < 12; i ++){
            
            for( j = 0; j < 4; j++){
                
                System.out.println("\nmes: " + (i + 1) + " semana: " + (j + 1));
                mat[i][j] = sc.nextFloat();
            }
        }
        
        totalAno = 0;
        
        for( i = 0; i < 12; i++){
            totalMes = 0;
            
            for( j = 0; j <4; j++){
                totalMes = totalMes + mat[i][j];
            }
            
            System.out.println("\ntotal do mes " + (i + 1) + " = " + totalMes);
            totalAno = totalAno + totalMes;
        }
        
        for( j = 0; j < 4; j++){
            
            totalSem = 0;
            
            for( i = 0; i < 12; i++){
                
                totalSem = totalSem + mat[i][j];
                System.out.println("\ntotal da semana " + (j + 1) + " = " + totalSem);
            }
            
            
        }
        System.out.println("\ntotal do ano = " + totalAno);
    }
    
}
