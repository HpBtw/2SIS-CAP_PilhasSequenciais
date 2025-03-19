package teste;

import pilhas.PilhaInt;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        pilha.push(10);
        pilha.push(12);
        pilha.push(22);
        pilha.push(46);
        pilha.push(44);
        pilha.push(25);
        pilha.push(10);
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
    }
}
