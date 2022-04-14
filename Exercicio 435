package edidois11;
import java.util.Scanner;

public class EdiDois11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dados[][] = new int[10][4];
        int L,codigo,pos, aux;
        
        for(L=0; L<10; L++){
            
            System.out.println("\ndigite matricula no formato aascccnnn: ");
            dados[L][0] = sc.nextInt();
            
            aux = dados[L][0] / 1000000;
            aux = dados[L][0] - aux * 1000000;
            dados [L][2] = aux / 1000;
            
            System.out.println("\ndigite sexo (0 fem 1 masc): ");
            dados[L][1] = sc.nextInt();
            
            System.out.println("\ndigite CR do aluno: ");
            dados [L][3] = sc.nextInt();
        }
        
        System.out.println("\ndigite codigo do curso: ");
        codigo = sc.nextInt();
        
        pos=0; //posicao inexistente
        
        for(L=0; L<10; L++){
            if(dados[L][2]==codigo && dados[L][1]==0){
                pos = L;
            } else if (dados [L][3] > dados [pos][3]){
                pos = L;
            }
            
            System.out.print("\nAluna premiada matricula: " + dados[pos][0] + " teve CR: " + dados[pos][3]);
                System.out.println();
    }
    
    }
}
