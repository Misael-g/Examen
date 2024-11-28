public class Estrategia  extends  VideoJuegos{
    private String nombreEstrateg;

    public Estrategia(String dondesejuega, int anioqsalio, String nombreEstrateg) {
        super(dondesejuega, anioqsalio);
        this.nombreEstrateg = nombreEstrateg;
    }

    public String getNombreEstrateg() {
        return nombreEstrateg;
    }

    public void setNombreEstrateg(String nombreEstrateg) {
        this.nombreEstrateg = nombreEstrateg;
    }
    public void imprimirestrategi(){
        System.out.println("y el nombre del juego de estrategia es" +nombreEstrateg);
    }
}

