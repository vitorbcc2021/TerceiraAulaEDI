package edidois4;
import java.util.Scanner;

public class EdiDois4 {
    public static void main(String[] args) {
        int mesa[] = new int[30];
        int i;
        int qtde[] = new int[30];
        int lugares, codigo, lugmesa;
        
        Scanner sc = new Scanner(System.in);

        for(i = 0; i < 30 ;i++){
            mesa[i] = 100 + i;
            qtde[i] = 5;
        }
        
        lugares = 150;
        
        System.out.print("\nentre com codigo (100 - 129) ou 0 para terminar: "); 
        codigo = sc.nextInt();

        while(codigo > 0 && lugares != 0){
            i = 0;

            while(codigo != mesa[i] && i < 29){
            i++;
            }

            if(codigo == mesa[i]){
                System.out.print("\nquantidade de lugares a reservar: "); 
                lugmesa = sc.nextInt();
                
                if( qtde[i] >= lugmesa){
                    qtde[i] = qtde[i] - lugmesa;
                    lugares = lugares - lugmesa;
                } else{
                    System.out.println("\nnao ha lugares a reservar");
                }
            } else{
                System.out.println("\ncodigo de mesa invalido");
            }
            
            System.out.print("\nentre com codigo (100 - 129) ou O para terminar: "); 
            codigo = sc.nextInt();
            
        }
        

        if(lugares == 0){
            System.out.println("\nLotacao esgotada");
        } else{
            System.out.println("\nLugares vagos\n");
            
            for(i = 0; i < 30 ;i++){
                if(qtde[i] != 0){
                System.out.println("\nmesa: " + mesa[i] + " total de lugares: " + qtde[i]);
            }
            }
        }
        System.out.println();
    }
    
}
