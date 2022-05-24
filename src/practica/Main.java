package practica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Quadrilateros
        System.out.println("Quadrilateros");
        System.out.println("Introduzca lados do quadrado:");
        double lado;
        lado= scan.nextInt();

        System.out.println("Introduzca lados do retangulo: ");
        double lado1;
        double lado2;
        lado1=scan.nextInt();
        lado2=scan.nextInt();

        System.out.println("Introduzca lados y altura do trapecio: ");
        double ladomaior;
        double ladomenor;
        double altura;
        System.out.println("lado maior: ");
        ladomaior=scan.nextInt();
        System.out.println("lado menor: ");
        ladomenor=scan.nextInt();
        System.out.println("Altura: ");
        altura=scan.nextInt();

/* SIN RETORNO (return)
        Quadrilateros.area(lado);
        Quadrilateros.area(lado1,lado2);
        Quadrilateros.area(ladomaior,ladomenor,altura);

*******************************************************************/

        // AULA 3.RETURN
    double areaQuadrado= Quadrilateros.area(lado);
        System.out.println("Area do quadrado: "+ areaQuadrado);
    double areaRetangulo=Quadrilateros.area(lado1,lado2);
        System.out.println("Area do retangulo: "+ areaRetangulo);
    double areaTrapecio= Quadrilateros.area(ladomaior,ladomenor,altura);
        System.out.println("Area do Trapecio: "+ areaTrapecio);




    }
}
