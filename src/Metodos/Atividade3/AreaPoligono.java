package Metodos.Atividade3;

import java.util.Scanner;

public class AreaPoligono {
    private static float lado1Quadrado;
    private static float lado2Quadrado;
    private static float alturaTriangulo;
    private static float baseTriangulo;
    private static float baseMaiorTrapezio;
    private static float baseMenorTrapezio;
    private static float alturaTrapezio;
    private static float diagonalMaiorLosango;
    private static float diagonalMenorLosango;


    /*
    *************************************
    * CÁLCULO DE ÁREA DE QUADRADO
    *************************************
    */
    public static void calcularAreaQuadrado(){
        obterDadosQuadrado();
        imprimirDadosQuadrado();
    }
    private static void obterDadosQuadrado(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado do Quadrado : ");
        lado1Quadrado = scan.nextFloat();
        System.out.println("Digite o valor do segundo lado do Quadrado : ");
        lado2Quadrado = scan.nextFloat();
    }
    private static float areaQuadrado(){
        return lado1Quadrado * lado2Quadrado;
    }
    private static void imprimirDadosQuadrado(){
        System.out.println("A área do Quadrado é :  " + areaQuadrado());
    }

    /*
     *************************************
     * CÁLCULO DE ÁREA DE TRIÂNGULO
     *************************************
     */

    public static void calcularAreaTriangulo(){
        obterDadosTriangulo();
        imprimirDadosTriangulo();
    }
    private static void obterDadosTriangulo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da altura do triângulo : ");
        alturaTriangulo = scan.nextFloat();
        System.out.println("Digite o valor da base do triângulo : ");
        baseTriangulo = scan.nextFloat();
    }
    private static float areaTriangulo(){
        return (baseTriangulo * alturaTriangulo)/2;
    }
    private static void imprimirDadosTriangulo() {
        System.out.println("A área do Triâgulo é : " + areaTriangulo());
    }

    /*
     *************************************
     * CÁLCULO DE ÁREA DE TRAPEZIO
     *************************************
     */
    public static void calcularAreaTrapezio(){
        obterDadosTrapezio();
        imprimirDadosTrapezio();
    }
    private static void obterDadosTrapezio(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da altura do trapézio : ");
        alturaTrapezio = scan.nextFloat();
        System.out.println("Digite o valor da base maior do trapézio : ");
        baseMaiorTrapezio = scan.nextFloat();
        System.out.println("Digite o valor da base menor do trapézio : ");
        baseMenorTrapezio = scan.nextFloat();
    }
    private static float areaTrapezio(){
        return ((baseMaiorTrapezio + baseMenorTrapezio)* alturaTrapezio)/2;
    }
    private static void imprimirDadosTrapezio() {
        System.out.println("A área do Trapézio é : " + areaTrapezio());
    }

    /*
     *************************************
     * CÁLCULO DE ÁREA DO LOSANGO
     *************************************
     */
    public static void calcularAreaLosango(){
        obterDadosLosango();
        imprimirDadosLosango();
    }
    private static void obterDadosLosango(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal maior do losango : ");
        diagonalMaiorLosango = scan.nextFloat();
        System.out.println("Digite o valor da diagonal menor: ");
        diagonalMenorLosango = scan.nextFloat();
    }
    private static float areaLosango(){
        return (diagonalMaiorLosango + diagonalMenorLosango)/2;
    }
    private static void imprimirDadosLosango() {
        System.out.println("A área do losango é : " + areaLosango());
    }


}
