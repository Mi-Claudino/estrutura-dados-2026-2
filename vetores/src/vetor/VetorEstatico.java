package vetor;

public class VetorEstatico {
    private String[] elementos;
    int tamanho;

    public VetorEstatico(int quantidade){
        elementos = new String[quantidade];
        this.tamanho = 0;
    }

    public void inserir(String elemento) {
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        } else{
            System.out.println("cheio");
        }

    }

    // public void inserir(String elemento) {
    //for (int i = 0; i < elementos.length; i++ ){
    // if(elementos[i] == null) {
    //elementos[i] = elemento;
    //return;
    // }
    // }
    //}

    public void inserir(int indice, String elemento) {
        if(tamanho >= elementos.length){
            System.out.println("vetor chieo");
            return;
        }

        if (indice < 0 || indice > elementos.length) {
            System.out.println("Posição inválida");
            return;
        }

        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[indice] = elemento;
        tamanho++;
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < elementos.length - 2; i++ ){
            System.out.print(elementos[i] + ", ");
        }
        System.out.println("]");
    }

    public int obterTamanho(){
        return this.tamanho;
    }

    public String ler(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Indice invalido");
        }
    }

    public void remover(){
        if(tamanho >0) {
            elementos[tamanho - 1] = null;
            tamanho--;
        } else {
            IO.println("Vetor vazio");
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho){
            IO.println("Indice invalido");
            return;
        }
        for (int i = indice; i < tamanho; i++){
            elementos[i] = elementos [i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
    }

    public void remover(String elemento){
        for (int i = 0; i < tamanho ; i++){

            if (elementos[i].equals(elemento)) {
                remover(i);
                return;
            }
        }
    }


}
