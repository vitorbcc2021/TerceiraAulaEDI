package edidois6;
import java.util.Scanner;
public class EdiDois6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int leitos[] = new int[50];
        int nd[] = new int[50];
        int i, k, chave, quarto, op;
        String sit[] = new String[50];
        String din[] = new String[50];
        String dout[] = new String[50];
        String nome[] = new String[50];
        String tel [] = new String[50];
        String resp, resp1, respo, nomep;
        float precos[] = new float[50];
        float despesas[] = new float[50];
        float valor, total;
        
        chave = 0;
        do
        {
            System.out.println("\n\nHotel Fazenda Sucesso\n");
            System.out.println("\nl. Cadastra quartos ");
            System.out.println("\n2. Lista todos os quartos");
            System.out.println("\n3. Lista quartos desocupados"); 
            System.out.println("\n 4 . Aluguel / reserva quarto");
            System.out.println("\nS. Entra despesas extras");
            System.out.println("\n6. Calcula despesa do quarto");
            System.out.println("\n7. Sai");
            System.out.println("\nopcao: ");
            op = sc.nextInt();
            System.out.println("\n");
            
            if (op==1){
                
                if( chave ==1){
            
                    System.out.println("\nAtencao. Dados ja cadastrados");
            
                } else{
                    
                    for( i = 0; i < 50; i++){

                        System.out.println("\nquantidade de leitos para o quarto " + (i + 1) + ": ");
                        leitos[i] = sc.nextInt();
                        
                        System.out.println("Preço do quarto: ");
                        
                        precos[i] = sc.nextFloat();
                        
                        sit[i] = "L";
                        nd[i] = 0;
                        despesas[i] = 0;
                        din[i] = " XXXX";
                        dout[i] = " XXXX";
                        nome[i] = "";
                        tel [i] = "";
                        
                        }
                        chave = 1;
                        }
            
            } else {
                if(op==2){
                    if( chave == 0){
                        System.out.println("\"\\nEscolha a opcao 1\"");
                    } else {
                        for( i = 0; i < 50; i++){
                            
                            System.out.println("\nnumero do quarto: " + (i+1) + "\n");
                            System.out.println("\nsituacao quarto: " + sit[i]);
                    
                           if(sit[i] == "A" || sit[i] == "R"){
                               
                               System.out.println("\"\\nnonie: " + nome[i]);
                               System.out.println("\"\\ntelefone: " + tel[i]);
                               
                           }
                           
                            System.out.println("\nquantidade de leitos: "+ leitos[i]);
                            
                            System.out.println("\npreco do quarto: " + precos[i]);
                            
                            System.out.println("\ndespesas: " + despesas[i]);
                            
                            System.out.println("\ndata de entrada: " + din[i]);
                            
                            System.out.println("\ndata de saida: " + dout[i]);
                            
                            System.out.println("\nnuniero de dias: " + nd[i]);
                            
                            System.out.println("\npressione enter para continuar:");
                            
                            respo = sc.next();
                            
                        }
                        
                }
                }else if(op==3){
                    if( chave ==0)
                    { imprima "\nEscolha a opcao 1"; }
                    else
                    { for( i = 0; i < 50; i++)
                    { if( sit[i] == "A"){
                        System.out.println("\nnumero do quarto: "+ (i +1));
                        System.out.println("\ndespesas: ", despesas[i]);
                        System.out.println("\ndata de entrada: ", din[i]);
                        System.out.println("\ndata de saida: ", dout[i]);
                        System.out.println("\nnumero de dias: ", nd[i]);
                        System.out.println("\npressione enter para continuar: ");
                        resp = sc.next();
                        
                            }
            
                    }
}
        }
                else
                        { if(op==4)
                        { if( chave == 0)
                        { System.out.println("\nEscolha a opcao 1"); }
                        else
                        { System.out.println("\nDigite A( aluguel) R(reserva): "); 
                        resp = sc.next();
                        while( resp != "A" && resp != "a" && resp != "R" && resp != "r")
                        { System.out.println("\nResposta invalida. Digite ( aluguel) R(reserva): ");
                        resp = sc.next(); }
                        if( resp == "A" || resp == "a")
                        { System.out.println("\n Tinha reserva ( s /n)? ");
                          respi = sc.next();
                        }
                        if( resp1 == "S" || resp1 == "s")
                        { imprima "\nEntre com nome: ";
                        nomep = sc.next();
                        }
                        i = 0;
                        while( nomep != nome[i] && i < 49 )
                        { i++;}
                        if(nomep == nome[i] )
                        { quarto = i;
                           sit[i] = "A";
                        } despesas [i] < 0;
                            System.out.println("\ndata de entrada: ");
                            din[quarto] = sc.next();
                            System.out.println("\ndata de saida: ");
                            dout[quarto] = sc.next();
                            System.out.println("\nnumero de dias: ");
                            nd[quarto] = sc.nextInt();
                        }
                        else
                        {   System.out.println("\nReserva nao encontrada");
                            respi = "N"; }
                        }
                        }
                        if(respl == "N" || respi == "n" || resp=="r" || resp=="R")
                        { for( i = 0; i < 50; i++)
                        { if( sit[i] == "L")
                        { System.out.println("\nnumero do quarto: "+ (i + 1);
                            System.out.println("\nquantidade de leitos: " + leitos[i]);
                            System.out.println("\npreco do quarto: " + precos[i]);
                            System.out.println("\npressione enter para continuar: ");
                            respo = sc.next();
                        }
                        }
                            System.out.println("\nDigite o numero do quarto para aluguel ou reserva: "); 
                            quarto = sc.nextInt();
                            while( quarto < 111 quarto > 50)
                            { System.out.println("\nQuarto Invalido. Entre novamente: "); 
                                quarto = sc.nextInt(); }
                                while(sit[quarto-1] == "A")
                                {   System.out.println("\nQuarto ocupado. Digite novamente: "); 
                                    quarto = sc.nextInt()); }
                                if( resp == "A" resp == "a")
                                { sit[quarto-1] = "A";
                                despesas[quarto -11 = 0];
                                }}
                                else
                                { sit[ quarto -11 <- "R"; }
                                System.out.println("\nDigite nome: ");
                                nome[quarto -11] = sc.next();
                                System.out.println("\nDigite telefone para contato: ");
                                tel[quarto-1] = sc.next();
                                System.out.println("\ndata de entrada: ");
                                din[quarto - 1] = sc.next();
                                System.out.println("\ndata de saida: ");
                                dout[quarto -11] = sc.next();
                                System.out.println("\nnumero de dias: ");
                                nd[quarto-1];
                                }
                                else
                                { if(op==5)
                                { if( chave ==0)
                                { System.out.println("\nEscolha a opcao 1"); }
                                else
                                { System.out.println("\nentre com numero do quarto: "); 
                                quarto = sc.nextInt();
                                while( quarto < l || quarto > 50)
                                {   System.out.println("\nentre com numero do quarto: ");
                                    quarto = sc.nextInt(); }
                                    System.out.println("\ndespesas: "); 
                                    valor = sc.nextFloat();
                                    despesas[quarto-1] = despesas[quarto - 1] + valor;
                                }
                                }
                                else
                                { if(op==6)
                                { if( chave ==0)
                                { System.out.println("\nEscolha aopcao 1"); }
                                else
                                { System.out.println("\nentre com numero do quarto: ");
                                quarto = sc.nextInt();
                                while( quarto < 111 || quarto > 50)
                                {   System.out.println("\nentre com numero do quarto: ");
                                    quarto = sc.nextInt(); }
                                    total = despesas[quarto-1] + precos[quarto-1];
                                    System.out.println("\ndespesas: R$ ", total);
                                    sit[quarto-1] = "L";
                                    despesas[quarto - 1] = 0.;
                                    din[quarto-1] = "XXXX";
                                    dout[quarto-1] = "XXXX";
                                    
                                        nd[quarto - 1] <- O;
                                    nome[quarto -1 ]
                                    }
                                    }
                                    else
                                    { if(op==7)
                                    { System.out.println("\nSaindo");
                                    else
                                    {System.out.println("\nOpcao nao disponivel");}
                                    }
                                    while( op != 7)
                                        System.out.println("\n");

    }
        }
        }
}
        }
}
