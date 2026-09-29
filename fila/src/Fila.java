public class Fila<T extends Comparable> {
    private T[] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Comparable[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void enfileirar(T elemento) {
        if (this.tamanho == this.elementos.length) {
            throw new RuntimeException("Fila cheia");
        } else {
            this.elementos[this.tamanho] = elemento;
            ++this.tamanho;
        }
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public T desenfileirar() {
        if (this.isEmpty()) {
            throw new RuntimeException("Fila vazia");
        } else {
            T elemento = this.elementos[0];

            for(int i = 0; i < this.tamanho - 1; ++i) {
                this.elementos[i] = this.elementos[i + 1];
            }

            this.elementos[this.tamanho - 1] = null;
            --this.tamanho;
            return elemento;
        }
    }

    public T frente() {
        if (this.isEmpty()) {
            throw new RuntimeException("Fila vazia");
        } else {
            return (T)this.elementos[0];
        }
    }

    public void imprimir() {
        if (this.isEmpty()) {
            System.out.println("Fila Vazia!");
        } else {
            System.out.println("Fila: ");

            for(int i = 0; i < this.tamanho; ++i) {
                Comparable var10001 = this.elementos[i];
                System.out.print(String.valueOf(var10001) + " ");
            }

            System.out.println();
        }

    }
}