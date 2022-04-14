package edidois1;
import java.util.Scanner;

public class EdiDois1 {

    public static void main(String[] args) {
        int L ,c ,t;
        double media[] = new double[15];
        String nomes[] = new String[15];
        String sit[] = new String[15];
        float pr1[] = new float[15];
        float pr2[] = new float[15];
        
        Scanner lerEntrada = new Scanner(System.in);
        
        //trecho de entrada de 15 nomes
        
        for(L=0; L <= 14 ; L++){
        
        System.out.println("\"\\n\\nDigite \", L + 1, \" nome: ");
        
        nomes[L] = lerEntrada.nextLine();
        
        while( nomes.length > 30){
            System.out.println("\\nNomes com ate 30 caracteres");
            System.out.println("\n\nDigite " + (L + 1) + " nome: ");
            nomes[ L ] = lerEntrada.nextLine();
        }
            //trecho que garante todos os nomes com 30 caracteres para fazer tabulacao
            
        t = 30 - nomes.length;
        
        for(c=1; c <= t; c++){
            nomes[L]= nomes[L] + " ";
            System.out.println("\"\\ndigite 1 nota: ");
            pr1[L] = lerEntrada.nextFloat();
            System.out.println("\"\\ndigite 2 nota: ");
            pr2[L] = lerEntrada.nextFloat();
            media[L] = ((pr1[L] + pr2[L] ) / (2.0 + 0.0001));
            
            if(media[ L ] >= 5 ){ 
                sit[ L ] = "AP";
            }
            else {
            sit[ L ] = "RP";
            }
        }
        
    }
//fim do trecho de entrada
//trecho de saida
        System.out.println("\"\\n\\n\\n\\t\\t\\t\\tRELACAO FINAL\\n\"");
        
        for( L=0; L <= 14 ; L++){
        System.out.println("\" \\n \" , L+1, \"- \",nomes [L] ,\"\\t\",prl[L] , \"\\t\", pr 2 [L]\n" + "\"\\t\",niedia[L], \"\\t\",sit[L]");
        }
        
//fim do trecho de saida
        System.out.println("\"\\n\"");
    }
    
}
