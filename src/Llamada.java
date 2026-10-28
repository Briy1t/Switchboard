public class Llamada {

    private int origen;
    private int destino;
    private int duracion;
    private int franja;

    public Llamada(int origen, int franja, int duracion, int destino) {
        this.origen = origen;
        this.franja = franja;
        this.duracion = duracion;
        this.destino = destino;
    }

    public int getOrigen() {
        return origen;
    }

    public int getDestino() {
        return destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getFranja() {
        return franja;
    }


}
