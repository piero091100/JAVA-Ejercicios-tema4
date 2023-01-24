
public class SmartPhone extends SmartDevice{
    private double tamPantalla;
    private int memoriaRam;
    private boolean resistenciaAgua;

    public SmartPhone() {

    }

    public SmartPhone(boolean conexionWifi, double capacidadAlmacenamiento,
                      String codigoSerie,
                      String sO, double tamPantalla, int memoriaRam,
                      boolean resistenciaAgua){
        super(conexionWifi, capacidadAlmacenamiento,
                codigoSerie, sO);
        this.tamPantalla = tamPantalla;
        this.memoriaRam = memoriaRam;
        this.resistenciaAgua = resistenciaAgua;
    }

    public void descargarVideojuego() {
        System.out.println("Descargando PUGB");
    }

    public void llamar() {
        System.out.println("Llamando");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Smartphone [conexión wifi: " + isConexionWifi());
        sb.append(", almacenamiento: " + getCapacidadAlmacenamiento());
        sb.append(", códigoSerie: " + getCodigoSerie());
        sb.append(", sistema operativo: " + getsO());
        sb.append(", tamaño de pantalla: " + tamPantalla);
        sb.append(", memoria ram: " + memoriaRam);
        sb.append(", resistencia al agua: " + resistenciaAgua);
        sb.append("]");
        return sb.toString();
    }
}
