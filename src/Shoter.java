public class Shoter  extends  VideoJuegos{

    private String nombreShoter;

    public Shoter(String dondesejuega, int anioqsalio, String nombreShoter) {
        super(dondesejuega, anioqsalio);
        this.nombreShoter = nombreShoter;
    }

    public String getNombreShoter() {
        return nombreShoter;
    }

    public void setNombreShoter(String nombreShoter) {
        this.nombreShoter = nombreShoter;
    }
    public void imprimirshoter(){
        System.out.println(" y el nombre del juego  shoter es " +nombreShoter);
    }
}
