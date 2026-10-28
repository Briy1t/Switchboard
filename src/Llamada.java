public class Llamada {

    public static final int PRECIO_LOCAL = 15;
    public static final int PRECIO_BANDA_1 = 20;
    public static final int PRECIO_BANDA_2 = 25;
    public static final int PRECIO_BANDA_3 = 30;

    private String origen;
    private String destino;
    private int duracion;
    private int banda;
    private boolean local;

    public Llamada(String origen,String destino, int duracion, int banda, boolean local) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.banda = banda;
        this.local = local;
    }





    @Override
    public String toString() {
        String tipo;
        if(local){
            tipo = "local";
        }else {
            tipo= "provicinal";
        }
        return " Origen: " + origen+ " Duracion:  "+ duracion+
                " Banda: "+ banda+ " Tipo: "+ tipo+ " Coste: " + getCost();
    }
    // en céntimos
    public int getCost(){
        if (local){
            return 15*duracion;
        }else {
            if (banda==1){
                return 20*duracion;
            }else
                if (banda==2){
                return 25*duracion;
            }else{
                    return 30* duracion;
                }
        }
    }
}
