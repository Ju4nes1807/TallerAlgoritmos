import java.util.Random;
import java.util.Scanner;

public class ControlRepetitivo {
    private final Scanner scanner;
    private final Random random;

    public ControlRepetitivo(Scanner scanner, Random random) {
        this.scanner = scanner;
        this.random = random;
    }

    public void Ejercicio46() {
       System.out.println("Ingrese un valor para N");
       int N = scanner.nextInt();
       System.out.println("Ingrese un valor para K");
       int K = scanner.nextInt();
        
        for (int i = N; i <= K; i++) {
            System.out.println("============================================");
            System.out.println("N - " + i);
            System.out.println("============================================");
        } 
    }

    public void Ejercicio47() {
       for (int i = 1; i <= 100; i += 2) {
          if (i % 7 != 0) {
            System.out.println("====================================");
            System.out.println("Num = " + i);
            System.out.println("====================================");
          }
       }
    }

    public void Ejercicio48() {
        System.out.println("Tabla de 28 a 54 °F (paso 1 °F)");
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Fahrenheit", "Celsius", "Kelvin", "Rankine");
        System.out.println("--------------------------------------------------");
        for (int f = 28; f <= 54; f += 1) {
            double c = 5.0 * (f - 32) / 9;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", f, c, k, r);
        }
        
        System.out.println("\nTabla de 450 a 950 °F (paso 50 °F)");
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Fahrenheit", "Celsius", "Kelvin", "Rankine");
        System.out.println("--------------------------------------------------");
        for (int f = 450; f <= 950; f += 50) {
            double c = 5.0 * (f - 32) / 9;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", f, c, k, r);
        }
        
        System.out.println("\nTabla de -50 a 250 °F (paso 10 °F)");
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Fahrenheit", "Celsius", "Kelvin", "Rankine");
        System.out.println("--------------------------------------------------");
        for (int f = -50; f <= 250; f += 10) {
            double c = 5.0 * (f - 32) / 9;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", f, c, k, r);
        }
    }

    public void Ejercicio49() {
        int a_todas = 0;
        int b_p1y2 = 0;
        int c_p1y3 = 0;
        int d_p2y3 = 0;
        int e_p1_al_menos = 0;
        int f_p2_al_menos = 0;
        int g_p3_al_menos = 0;
        int h_ninguna = 0;

        for (int i = 1; i <= 100; i++) {
            // Respuestas aleatorias: 1 = correcta, 0 = incorrecta
            int p1 = random.nextInt(2);
            int p2 = random.nextInt(2);
            int p3 = random.nextInt(2);

            if (p1 == 1 && p2 == 1 && p3 == 1) a_todas++;
            if (p1 == 1 && p2 == 1 && p3 == 0) b_p1y2++;
            if (p1 == 1 && p2 == 0 && p3 == 1) c_p1y3++;
            if (p1 == 0 && p2 == 1 && p3 == 1) d_p2y3++;
            if (p1 == 1) e_p1_al_menos++;
            if (p2 == 1) f_p2_al_menos++;
            if (p3 == 1) g_p3_al_menos++;
            if (p1 == 0 && p2 == 0 && p3 == 0) h_ninguna++;
        }

        System.out.println("Resultados:");
        System.out.println("a. Correctamente las tres preguntas: " + a_todas);
        System.out.println("b. Solo la primera y segunda: " + b_p1y2);
        System.out.println("c. Solo la primera y tercera: " + c_p1y3);
        System.out.println("d. Solo la segunda y tercera: " + d_p2y3);
        System.out.println("e. Al menos la primera: " + e_p1_al_menos);
        System.out.println("f. Al menos la segunda: " + f_p2_al_menos);
        System.out.println("g. Al menos la tercera: " + g_p3_al_menos);
        System.out.println("h. Ninguna correcta: " + h_ninguna);
    }

    public void Ejercicio50() {
        for (int i = 97; i <= 1003; i++) {
            if (i % 2 == 0) {
                System.out.println("==============================");
                System.out.println("Suma: " + i);
                System.out.println("==============================");
            }
        }
    }

    public void Ejercicio51() {
    int a = 6;
    int d = 5;
    int suma = 0;

    for (int i = 0; i < 12; i++) {
        int termino = a + i * d;
        System.out.println("Término " + (i + 1) + ": " + termino);
        suma += termino;
    }

    System.out.println("La suma de los primeros 12 términos de la serie es: " + suma);
    }
}


