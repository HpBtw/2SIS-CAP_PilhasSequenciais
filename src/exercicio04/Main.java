package exercicio04;

import pilhas.PilhaInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        PilhaInt pilha = new PilhaInt();
        pilha.init();

        int digito;
        int n = 0;
        int[] leitura = new int[8];

        System.out.println("Informe um digito");
        digito = kb.nextInt();

        while (digito >= 0) {
            leitura[n] = digito;
            n++;
            pilha.push(digito);
            System.out.println("Informe um digito");
            digito = kb.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < n && palindromo; i++) {
            if (leitura[i] != pilha.pop())
                palindromo = false;
        }

        if (palindromo)
            System.out.println("É palindromo");
        else
            System.out.println("Não é palíndromo");
    }
}
