package vetor.testes;

import vetor.VetorEstatico;

public class ex4 {
    public static void main(String[] args) {


        VetorEstatico vetor = new VetorEstatico(6);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("F");

        vetor.imprimir();

        // Removendo
        IO.println("Removendo o elemento 8");
        vetor.remover("C");

        IO.println("Arranjo apos a remocao");
        vetor.imprimir();



    }
}




