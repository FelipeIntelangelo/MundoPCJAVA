package Domain;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 6;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se excedio del limite preestablecido: "+ Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("id de la Orden: "+ this.idOrden);
        System.out.println("Computadoras de la orden n° "+this.idOrden + ": ");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
    
}
