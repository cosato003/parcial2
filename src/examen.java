import java.util.Random;

public class examen {

    public static final int Led = 1;
    public static final int Multiled = 2;
    public static final int Halogena = 3;

    // función para calcular un número aleatorio entre min y max
    public static int generarAleatorio(int min, int max) {
        Random random = new Random(); // variable para generar números aleatorios
        return random.nextInt(max - min + 1) + min; // genera números aleatorios
    }

    // función para calcular el costo de luz de un hotel por hora con un switch
    public static double calcularCostoLuz(int tipoLuz, int horasEncendidas, int numLuces) {
        double costoPorHora = 0.0;

        switch (tipoLuz) {
            case Led:
                costoPorHora = 0.50;
                break;
            case Multiled:
                costoPorHora = 0.25;
                break;
            case Halogena:
                costoPorHora = 1.00;
                break;
        }

        double costoTotal = costoPorHora * horasEncendidas * numLuces; // calcula costo total de la luz
        double horasTotales = horasEncendidas * numLuces; // calcula el total de horas encendidas

        System.out.println("Costo total de la luz: " + costoTotal); // Se imprime el costo total en la consola.
        System.out.println("Horas totales encendidas: " + horasTotales); // Se imprime el total de horas encendidas.

        return costoTotal; // costo total de la luz
    }

    public static void main(String[] args) {
        int numHoteles = generarAleatorio(1, 7); // genera num aleatorio entre 1 y 7
        System.out.println("Numero de hoteles: " + numHoteles); // imprime numero de hoteles

        for (int i = 0; i < numHoteles; i++) {
            int numPisos = generarAleatorio(3, 15);// genera num aleatorio entre 3 y 15
            int tipoLuz = generarAleatorio(1, 3);// genera num aleatorio entre 1 y 3
            int horasEncendidas = generarAleatorio(0, 24); // genera num aleatorio entre 0 y 24

            System.out.println("Hotel(es) " + (i + 1));
            System.out.println("Numero de pisos " + numPisos);

            String tipoLuzString = "";
            switch (tipoLuz) { // determinamos tipo de luz con el switch
                case Led:
                    tipoLuzString = "Led";
                    break;
                case Multiled:
                    tipoLuzString = "Multiled";
                    break;
                case Halogena:
                    tipoLuzString = "Halogena";
                    break;
            }
            System.out.println("Tipo de luz: " + tipoLuzString); // imprime el tipo de luz en consola
            System.out.println("Horas encendidas " + horasEncendidas);// se imprime el numero de horas encendidas

            for (int j = 0; j < numPisos; j++) {
                int numLucesPorPiso = generarAleatorio(1, 3); // numero de luces por piso aleatorio
                System.out.println("Piso " + (j + 1) + ": " + numLucesPorPiso + " luces"); // imprime el numero de luces
                                                                                           // por piso
                calcularCostoLuz(tipoLuz, horasEncendidas, numLucesPorPiso);// llama a la función para calcular el costo
                                                                            // de la luz en este piso.
            }
        }
    }
}
