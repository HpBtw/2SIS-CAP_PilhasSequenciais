package exercicio03;

import pilhas.PilhaInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        PilhaInt pilha = new PilhaInt();
        pilha.init();

        int valor, resto;

        System.out.println("Informe um valor para conversão em binário: ");
        valor = kb.nextInt();

        while (valor != 0) {
            resto = valor % 2;
            pilha.push(resto);
            valor = valor / 2;
        }

        System.out.println("Valor binário: ");
        pilha.esvaziarPilha();

    }
}
