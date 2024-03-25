/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = entrada.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = entrada.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = entrada.nextDouble();
        } while (salario <= 0);

        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = entrada.next();
        } while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = entrada.next();
        } while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")
                && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"));

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        entrada.close();
    }
}
