import java.util.Random;
import java.util.ArrayList;

public class examen {
    // funciono para calcula un numero max y un min aleatorio
    public static int generarAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }

    // funcion para calcula el costo de luz de un hotel
    public static double calcularCostoLuz(int tipoLuz, int horasEncendidas) {
        double costoPorHora = 0.0;

        switch (tipoLuz) {
            case 1:
                costoPorHora = 0.50;
                break;
            case 2:
                costoPorHora = 0.25;
                break;
            case 3:
                costoPorHora = 1.00;

        }
        return costoPorHora * horasEncendidas;
    }

    public static void main(String[] args) {
        int numHoteles = generarAleatorio(1, 7);
        System.out.println("Numero de hoteles: " + numHoteles);
    }

}