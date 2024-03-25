/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();

        System.out.print("Números no intervalo entre " + numero1 + " e " + numero2 + ":");
        if (numero1 < numero2) {
            for (int i = numero1 + 1; i < numero2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = numero2 + 1; i < numero1; i++) {
                System.out.print(i + " ");
            }
        }

        entrada.close();
    }
}
