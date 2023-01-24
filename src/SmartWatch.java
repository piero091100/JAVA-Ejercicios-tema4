
public class SmartWatch extends SmartDevice{
    private String colorCorrea;
    private String materialCorrea;

    public SmartWatch() {

    }

    public SmartWatch(boolean conexionWifi, double capacidadAlmacenamiento,
                      String codigoSerie,
                      String sO, String colorCorrea, String materialCorrea){
        super(conexionWifi, capacidadAlmacenamiento,
                codigoSerie, sO);
        this.colorCorrea = colorCorrea;
        this.materialCorrea = materialCorrea;
    }

    public void actualizarSoftware() {
        System.out.println("Actualizando Software");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Smartwatch [conexión wifi: " + isConexionWifi());
        sb.append(", almacenamiento: " + getCapacidadAlmacenamiento());
        sb.append(", códigoSerie: " + getCodigoSerie());
        sb.append(", sistema operativo: " + getsO());
        sb.append(", color de correa: " + colorCorrea);
        sb.append(", material de correa: " + materialCorrea);
        sb.append("]");
        return sb.toString();
    }
}
