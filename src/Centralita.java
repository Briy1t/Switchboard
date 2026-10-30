public class Centralita {
    private Llamada[] llamadas;
    private int numCalls;

    public Centralita(int numMaxCalls) {
        llamadas = new Llamada[numMaxCalls];
        numCalls = 0;
        for (int i= 0; i< llamadas.length; i++){
            llamadas[i] = null;
        }
    }

    public void registerCall(Llamada llamada){
        llamadas[numCalls] = llamada;
        numCalls++;
    }

    public int getNumCalls(){
        return numCalls;
    }

    public int getTotalCost(){
        int total =0;
        for(int i= 0; i< numCalls ; i++){
            System.out.println(i);
            total = total + llamadas[i].getCost();
        }
        return total;
    }
}


