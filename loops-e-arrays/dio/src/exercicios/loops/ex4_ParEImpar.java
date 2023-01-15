package exercicios.loops;

import java.util.Scanner;

public class ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, qtdDeNumeros, qtdDeNumerosImpar = 0, qtdDeNumerosPar = 0, count = 0;

        System.out.println("Quantidade de números: ");
            qtdDeNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) qtdDeNumerosPar ++;
            else qtdDeNumerosImpar ++;
                
            count ++;
        
        }while (count < qtdDeNumeros );

        System.out.println("Quantidade par: " + qtdDeNumerosPar);
        System.out.println("Quantidade impar: " + qtdDeNumerosImpar);
    }
}
