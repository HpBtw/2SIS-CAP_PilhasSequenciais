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
        pilha.push(55);

        if(pilha.isEmpty())
            System.out.println("Empty stack");
        else
            System.out.println("Valor do topo: " + pilha.top());

        System.out.println("Valores empilhados: ");
        pilha.esvaziarPilha();
    }
}
