package Domain;

import Domain.DispositivoEntrada;

public class Mouse extends DispositivoEntrada{
    private final int idMouse;
    private static int contadorRatones;

    
    public Mouse(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}

