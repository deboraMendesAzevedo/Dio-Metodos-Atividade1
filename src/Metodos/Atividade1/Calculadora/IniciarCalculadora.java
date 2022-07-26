package Metodos.Atividade1.Calculadora;


import java.util.Scanner;

public class IniciarCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Digite o primeiro número : ");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo número : ");
        numero2 = scan.nextInt();

        Calculadora calc = new Calculadora();

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + calc.somar(numero1,numero2));
        System.out.println("A subtração de " + numero1 + " e " + numero2 + " é " + calc.subtrair(numero1,numero2));
        System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é " + calc.multiplicar(numero1,numero2));
        System.out.println("A divisão de " + numero1 + " e " + numero2 + " é " + calc.dividir(numero1,numero2));

        CalculadoraDebora calcDebora = new CalculadoraDebora();
        calcDebora.obterNumeros();
        System.out.println("A soma de " + calcDebora.numero1 + " e " + calcDebora.numero2 + " é " + calcDebora.somar());


    }
}