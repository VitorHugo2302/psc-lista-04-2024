/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeUsuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = entrada.nextLine();

            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("A senha n?o pode ser igual ao nome de usuário!");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Sucesso");
        entrada.close();
    }
}
