package Metodos.Atividade2;

import java.util.Scanner;

public class AreaQuadrilatero {
    private static float lado1Quadrado;
    private static float lado2Quadrado;
    private static float alturaTriangulo;
    private static float baseTriangulo;
    private static float baseMaiorTrapezio;
    private static float baseMenorTrapezio;
    private static float alturaTrapezio;
    private static float diagonalMaiorLosango;
    private static float diagonalMenorLosango;


    public static void dadosQuadrado(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado do Quadrado : ");
        lado1Quadrado = scan.nextFloat();
        System.out.println("Digite o valor do segundo lado do Quadrado : ");
        lado2Quadrado = scan.nextFloat();

    }
    public static void dadosTriangulo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da altura do triângulo : ");
        alturaTriangulo = scan.nextFloat();
        System.out.println("Digite o valor da base do triângulo : ");
        baseTriangulo = scan.nextFloat();

    }
    public static void dadosTrapezio(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da altura do trapézio : ");
        alturaTrapezio = scan.nextFloat();
        System.out.println("Digite o valor da base maior do trapézio : ");
        baseMaiorTrapezio = scan.nextFloat();
        System.out.println("Digite o valor da base menor do trapézio : ");
        baseMenorTrapezio = scan.nextFloat();

    }
    public static void dadosLosango(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal maior do losango : ");
        diagonalMaiorLosango = scan.nextFloat();
        System.out.println("Digite o valor da diagonal menor: ");
        diagonalMenorLosango = scan.nextFloat();

    }
    public static float areaQuadrado(){
        return lado1Quadrado * lado2Quadrado;
    }
    public static float areaTriangulo(){
        return (baseTriangulo * alturaTriangulo)/2;
    }
    public static float areaTrapezio(){
        return ((baseMaiorTrapezio + baseMenorTrapezio)* alturaTrapezio)/2;
    }
    public static float areaLosango(){
        return (diagonalMaiorLosango + diagonalMenorLosango)/2;
    }
    public static void imprimirArea(){
        System.out.println("A área do Quadrado é :  " + areaQuadrado());
        System.out.println("A área do Triâgulo é : " + areaTriangulo());
        System.out.println("A área do Trapézio é : " + areaTrapezio());
        System.out.println("A área do losango é : " + areaLosango());

    }


}
