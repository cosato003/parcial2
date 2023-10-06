import java.util.Random;

public class examen {
    // funciono para calcula un numero max y un min aleatorio
    public static int generarAleatorio(int min, int max) {
        Random random = new Random(); // variable para generar numeros aleatorios
        return random.nextInt(max - min + 1) + min; // genera numeros aleatorios

    }

    // funcion para calcula el costo de luz de un hotel
    public static double calcularCostoLuz(int tipoLuz, int horasEncendidas) {

        // inicia el costo por hora en 0.0
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

        for (int i = 0; i < numHoteles; i++) {
            int numPisos = generarAleatorio(3, 15);
            int tipoLuz = generarAleatorio(1, 3);
            int horasEncendidas = generarAleatorio(0, 24);

            double costoLuz = calcularCostoLuz(tipoLuz, horasEncendidas);

            System.out.println("Hotel(es) " + (i + 1));
            System.out.println("Numero de pisos " + numPisos);
            System.out.println("Tipo de luz " + tipoLuz);
            System.out.println("Horas encendidias " + horasEncendidas);
            System.out.println("Costo de la luz " + costoLuz);

        }
    }

}