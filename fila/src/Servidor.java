import java.util.Random;

public class Servidor {



    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;
    private Random aleatorio;
    private Fila<String> fila;
    private int numProcessadores;
    private int N;

    public Servidor(int capacidade, int numProcessadores, int N) {
        this.fila = new Fila<>(capacidade);
        this.numProcessadores = numProcessadores;
        this.N = N;

    }

    public void executar (int ciclos) {
        for (int ciclo = 1; ciclo <= ciclos ; ciclo++) {
            int novasReq = aleatorio.nextInt(1,N);
            totalReqGeradas += novasReq;
            for (int i = 0; i < novasReq; i++) {
                fila.enfileirar(String.valueOf(Math.random() * 100));
            }


            for (int i = 0; i < numProcessadores; i++) {
                if (!fila.isEmpty()) {
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }

        }
    }

    public void relatorio(){
        IO.println(totalReqAtendidas);
        IO.println(totalReqGeradas);

    }

}
