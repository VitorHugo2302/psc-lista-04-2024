/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char repetir;

        do {
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;
            int anos = 0;

            System.out.print("Informe a popula�?o inicial do pa�s A: ");
            populacaoA = entrada.nextInt();

            System.out.print("Informe a taxa de crescimento anual do pa�s A (em decimal): ");
            taxaCrescimentoA = entrada.nextDouble();

            System.out.print("Informe a popula�?o inicial do pa�s B: ");
            populacaoB = entrada.nextInt();

            System.out.print("Informe a taxa de crescimento anual do pa�s B (em decimal): ");
            taxaCrescimentoB = entrada.nextDouble();

            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            System.out.println("N�mero de anos necess�rios para A ultrapassar B: " + anos);

            System.out.print("Deseja repetir a opera�?o? (S/N): ");
            repetir = entrada.next().charAt(0);
        } while (Character.toUpperCase(repetir) == 'S');

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
