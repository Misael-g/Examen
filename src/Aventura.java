public class Aventura  extends  VideoJuegos{
    private String nombreAven;

    public Aventura(String dondesejuega, int anioqsalio, String nombreAven) {
        super(dondesejuega, anioqsalio);
        this.nombreAven = nombreAven;
    }

    public String getNombreAven() {
        return nombreAven;
    }

    public void setNombreAven(String nombreAven) {
        this.nombreAven = nombreAven;
    }
    public void imprimirAventura(){
        System.out.println("y el nombre del juego de Aventura es " +nombreAven);
    }
}
