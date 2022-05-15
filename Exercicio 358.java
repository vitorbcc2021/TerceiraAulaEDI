package edidois2;
import java.util.Scanner;

public class EdiDois2 {
    public static void main(String[] args) {
        float precocompra[] = new float[100];
        float precovenda[] = new float[100];
        float lucro;
        int totlucromenor10,totlucromenor20,totlucromaior20, A;
        
        Scanner sc = new Scanner(System.in);
        
        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;
        
        for(A = 0; A < 100; A++){
            
            System.out.print("\nPreco de compra: ");
            precocompra[A] = sc.nextFloat();
            System.out.print("\nPreco de venda: ");
            precovenda[A] = sc.nextFloat();
        }
        
        for(A=0; A < 100; A++){
            lucro = precovenda[A] - precocompra[A];
            
            if(lucro < 10.0){
                totlucromenor10++;
            }else if (lucro <= 20.0){
                totlucromenor20++;
            } else { 
                totlucromaior20++;
            }
}
        System.out.println("\ntotal de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("\ntotal de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("\ntotal de mercadorias com lucro > 20%: "+ totlucromaior20);
        System.out.println("\n");
    }
    
}
