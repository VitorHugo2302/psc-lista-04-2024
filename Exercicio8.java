/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeNumeros = 5;
        int soma = 0;
        double media;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            int numero = entrada.nextInt();
            soma += numero; 
        }

        media = (double) soma / quantidadeNumeros;

        System.out.println("A soma dos n�meros �: " + soma);
        System.out.println("A m�dia dos n�meros �: " + media);
        entrada.close();
    }
}
