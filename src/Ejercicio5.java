public class Ejercicio5 {
    public static void main(String[] args) {

        Centralita centralita = new Centralita(1000);
        centralita.registerCall(new Llamada("555-45632", "552-547745",30,1,true));
        centralita.registerCall(new Llamada("555-45685", "552-547123",20,2,true));
        centralita.registerCall(new Llamada("555-45782", "552-547456",10,3,false));
        centralita.registerCall(new Llamada("555-45456", "552-547845",50,1,true));
        System.out.println(" Numero total de llamadas: "+centralita.getNumCalls());
        System.out.println(" Coste total de las llamadas: " + centralita.getTotalCost());
    }
}
