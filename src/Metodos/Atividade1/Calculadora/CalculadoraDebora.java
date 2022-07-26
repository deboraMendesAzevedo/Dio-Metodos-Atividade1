package Metodos.Atividade1.Calculadora;

import java.util.Scanner;

public class CalculadoraDebora {
    public static double numero1;
    public static double numero2;

    public static void obterNumeros(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número : ");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo número : ");
        numero2 = scan.nextInt();

    }
        public static double somar() {
            return numero1 + numero2;
        }

        public static double subtrair() {
            return numero1 - numero2;
        }

        public static double multiplicar() {
            return numero1 * numero2;
        }

        public static double  dividir() {
            return numero1 / numero2;
        }

        public static void imprimirDados(){
            System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + somar());
            System.out.println("A subtração de " + numero1 + " e " + numero2 + " é " + subtrair());
            System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é " + multiplicar());
            System.out.println("A divisão de " + numero1 + " e " + numero2 + " é " + dividir());

        }

    }





