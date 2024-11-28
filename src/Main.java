import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VideoJuegos juego1 = new VideoJuegos("PC", 0);
        Shoter shoter1 = new Shoter("PC", 2020, "Valorant");
        Estrategia estrategi1 = new Estrategia("PC", 2018, "Age of Empires");
        Aventura aventura1 = new Aventura("PC", 2022, "The Witcher 3");


        System.out.println("-------------------------");
        System.out.println("Tenemos 3 categorías de juegos: Shoter, Estrategia y Aventura.");
        System.out.println("A continuación, se presenta la información de los juegos.");

        System.out.println("Seleccione una categoría de juego:");
        System.out.println("1. Shoter");
        System.out.println("2. Estrategia");
        System.out.println("3. Aventura");


        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Información del juego de Shooters:");
                shoter1.imprimirvido();
                shoter1.imprimirshoter();
                break;
            case 2:
                System.out.println("Información del juego de Estrategia:");
                estrategi1.imprimirvido();
                estrategi1.imprimirestrategi();
                break;
            case 3:
                System.out.println("Información del juego de Aventura:");
                aventura1.imprimirvido();
                aventura1.imprimirAventura();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
}




















