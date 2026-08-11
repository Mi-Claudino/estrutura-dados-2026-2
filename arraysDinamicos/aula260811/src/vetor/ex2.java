package vetor;

public class ex2 {

    static void main() {

        VetorDinamico vetor = new VetorDinamico(2);


        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        // expandir
        vetor.inserir("Ana");
        vetor.imprimir();
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");

        // expandir
        vetor.inserir("Ana");
        vetor.imprimir();

        vetor.remover(1);
        vetor.remover(2);
        vetor.remover(4);
        vetor.imprimir();
    }
}