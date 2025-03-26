package pilhas;

public class PilhaInt {

    final int N = 6;
    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public boolean isFull() {
        return (topo == N);
    }

    public void push(int elem) {
        if (isFull()) {
            System.err.println("Stack overflow - Limite da pilha excedido");
        } else {
            dados[topo] = elem;
            topo++;
        }
    }

    public int pop() {
        topo--;
        return dados[topo];
    }

    public boolean isEmpty () {
        return (topo == 0);
    }

    public int top() { return (dados[topo-1]); }

    public void esvaziarPilha() {
        while (!isEmpty()) {
            System.out.print(pop() + "\t");
        }
    }

    public boolean palindromo() {

        return true;
    }

}
