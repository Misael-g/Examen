public class VideoJuegos {
    private  String dondesejuega;
    private int anioqsalio;


    public VideoJuegos( String dondesejuega,int anioqsalio) {
        this.dondesejuega = dondesejuega;
        this.anioqsalio = anioqsalio;
    }

    public String getDondesejuega() {
        return dondesejuega;
    }

    public double getPrecio() {
        return anioqsalio;
    }

    public void setDondesejuega(String dondesejuega) {
        this.dondesejuega = dondesejuega;
    }

    public void setPrecio(int anioqsalio) {
        this.anioqsalio = anioqsalio;
    }

    public void imprimirvido(){
        System.out.println("El juego se juega en " +dondesejuega+" y salio en el año "+anioqsalio);
    }
}
































