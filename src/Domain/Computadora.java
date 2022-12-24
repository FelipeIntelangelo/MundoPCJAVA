package Domain;

public class Computadora {
    private final int idComputadora;
    private String marca;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadoras;
    
    protected Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    public Computadora(String marca, Monitor monitor, Teclado teclado, Mouse mouse){
        this();
        this.marca = marca;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", marca=").append(marca);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nombre) {
        this.marca = marca;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    
}
