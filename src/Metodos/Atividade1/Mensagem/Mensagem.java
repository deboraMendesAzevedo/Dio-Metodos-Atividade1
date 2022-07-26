package Metodos.Atividade1.Mensagem;

import java.util.Scanner;

public class Mensagem {
    public static int hora;

    public static void obterHora(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a hora : ");
        hora = scan.nextInt();

    }
    public static void mensagemHora(){
        if ((hora >=0 && hora <=4 )|| (hora >= 18 && hora <=23 )){
            System.out.println("Boa noite!");
        }
        else if (hora >=5 && hora <=12 ){
            System.out.println("Bom dia!");
        }
        else if (hora >= 13 && hora <= 17){
            System.out.println("Boa tarde!");
        }
        else{
            System.out.println("Opção inválida ");
        }

    }
}
