package Metodos.Atividade1.Emprestimo;

import java.lang.Math;
import java.util.Scanner;

public class Emprestimo {

    public static String nome;
    public static float valorEmprestimo;
    public static int numeroParcelas;
    private static float taxaJuros;


    public static void obterDados() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome : ");
        nome = scan.nextLine();
        System.out.println("Digite o valor a ser emprestado : ");
        valorEmprestimo = scan.nextInt();
        System.out.println("Digite a quantidade de parcelas : ");
        numeroParcelas = scan.nextInt();

    }


    private static float calcularValorMontante() {
        // M = C (1+i)t
        taxaJuros = (float) 0.1;
        float i = 1 + taxaJuros;
        float respostaTaxa = (float) Math.pow(i,numeroParcelas);
        float montante = valorEmprestimo * respostaTaxa;
        return (float) (montante);

    }

    public static float valorParcela() {
        return (calcularValorMontante() / numeroParcelas);
    }

    public static void imprimirDados() {
        System.out.println("Seja bem vinda(o), " + nome);
        System.out.println("O valor total do emprestimo será de " + calcularValorMontante());
        System.out.println("Número de parcelas " + numeroParcelas);
        System.out.println("Valor por parcela " + valorParcela());
    }
}


