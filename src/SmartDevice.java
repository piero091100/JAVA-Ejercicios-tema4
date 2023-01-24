
public class SmartDevice {
    private boolean conexionWifi;
    private double capacidadAlmacenamiento;
    private String codigoSerie;
    private String sO;

    public SmartDevice(){

    }

    public SmartDevice(boolean conexionWifi, double capacidadAlmacenamiento,
                       String codigoSerie, String sO){
        this.conexionWifi = conexionWifi;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.codigoSerie = codigoSerie;
        this.sO = sO;
    }

    public void encenderWifi() {
        this.conexionWifi = true;
    }

    public void apagarWifi() {
        this.conexionWifi = false;
    }

    public boolean isConexionWifi() {
        return conexionWifi;
    }

    public void setConexionWifi(boolean conexionWifi) {
        this.conexionWifi = conexionWifi;
    }

    public double getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(double capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public String getsO() {
        return sO;
    }

    public void setsO(String sO) {
        this.sO = sO;
    }
}
