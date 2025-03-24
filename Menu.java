import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.0");
            ControlSecuencial controlSecuencial = new ControlSecuencial(scanner, df);
            ControlDecision controlDecision = new ControlDecision(scanner, df);
            int opcion;
            
            do {
                System.out.println("-- MENU DE OPCIONES --");
                System.out.println("Seleccion un ejercicio del (1 al 23) para controlsecuencial");
                System.out.println("Seleccione un ejercicio del (24 al 45) para controldecision");
                System.out.println("0 para salir");
                
                System.out.println("Escoga una opcion");
                
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> controlSecuencial.Ejercicio1();
                    
                    case 2 -> controlSecuencial.Ejercicio2();
                    
                    case 3 -> controlSecuencial.Ejercicio3();
                    
                    case 4 -> controlSecuencial.Ejercicio4();
                    
                    case 5 -> controlSecuencial.Ejercicio5();
                    
                    case 6 -> controlSecuencial.Ejercicio6();
                    
                    case 7 -> controlSecuencial.Ejercicio7();
                    
                    case 8 -> controlSecuencial.Ejercicio8();
                    
                    case 9 -> controlSecuencial.Ejercicio9();
                    
                    case 10 -> controlSecuencial.Ejercicio10();
                    
                    case 11 -> controlSecuencial.Ejercicio11();
                    
                    case 12 -> controlSecuencial.Ejercicio12();
                    
                    case 13 -> controlSecuencial.Ejercicio13();
                    
                    case 14 -> controlSecuencial.Ejercicio14();
                    
                    case 15 -> controlSecuencial.Ejercicio15();
                    
                    case 16 -> controlSecuencial.Ejercicio16();
                    
                    case 17 -> controlSecuencial.Ejercicio17();
                    
                    case 18 -> controlSecuencial.Ejercicio18();
                    
                    case 19 -> controlSecuencial.Ejercicio19();
                    
                    case 20 -> controlSecuencial.Ejercicio20();
                    
                    case 21 -> controlSecuencial.Ejercicio21();
                    
                    case 22 -> controlSecuencial.Ejercicio22();
                    
                    case 23 -> controlSecuencial.Ejercicio23();
                    
                    case 24 -> controlDecision.Ejercicio24();
                    
                    case 25 -> controlDecision.Ejercicio25();

                    case 26 -> controlDecision.Ejercicio26();
                    
                    case 27 -> controlDecision.Ejercicio27();
                   
                    case 28 -> controlDecision.Ejercicio28();
                    
                    case 29 -> controlDecision.Ejercicio29();
                    
                    case 30 -> controlDecision.Ejercicio30();
                    
                    case 31 -> controlDecision.Ejercicio31();
                    
                    case 32 -> controlDecision.Ejercicio32();
                    
                    case 33 -> controlDecision.Ejercicio33();
                    
                    case 34 -> controlDecision.Ejercicio34();
                    
                    case 35 -> controlDecision.Ejercicio35();
                    
                    case 36 -> controlDecision.Ejercicio36();
                    
                    case 37 -> controlDecision.Ejercicio37();
                    
                    case 38 -> controlDecision.Ejercicio38();

                    case 39 -> controlDecision.Ejercicio39();

                    case 40 -> controlDecision.Ejercicio40();

                    case 41 -> controlDecision.Ejercicio41();

                    case 42 -> controlDecision.Ejercicio42();

                    case 43 -> controlDecision.Ejercicio43();

                    case 44 -> controlDecision.Ejercicio44();

                    case 45 -> controlDecision.Ejercicio45();

                    case 0 -> System.out.println("Saliendo del programa...");
                    
                    default -> System.out.println("Error intente de nuevo");
                    
                }
            } while (opcion != 0);
        }
    }
}
