package edidois3;
import java.util.Scanner;

public class EdiDois3 {
    public static void main(String[] args) {
        
        int ultdia[] = new int[12];
        int data, i, dia, mes;
        String signo[] = new String[12];
        
        Scanner sc = new Scanner(System.in);
        
        for(i=0; i < 12; i++){
            
            System.out.println("\ndigite signo: ");
            signo[i] = sc.next();
            System.out.println("\ndigite ultimo dia: ");
            ultdia[i] = sc.nextInt();
            
        }
        
        System.out.println("\ndigite data no formato ddmm ou 9999 para terminar: ");
        data = sc.nextInt();
        
        while( data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes--;
            
            if( dia > ultdia [mes] ){
                mes = (mes+ 1) %12;
            }
            
            System.out.println("\nsigno: " + signo[ mes ] + "\n");
            System.out.println("\ndigite data no formato ddmm ou 9999 para terminar: ");
            data = sc.nextInt();
        }
        
        System.out.println("\n");
        
    }
    
}
