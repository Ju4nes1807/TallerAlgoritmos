import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlRepetitivo {
    private final Scanner scanner;
    private final DecimalFormat df;

    public ControlRepetitivo(Scanner scanner, DecimalFormat df) {
        this.scanner = scanner;
        this.df = df;
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
        
    }
}


