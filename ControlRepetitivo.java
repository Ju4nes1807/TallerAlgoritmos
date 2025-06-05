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

    public void Ejercicio52() {
        double pesoNiños = 0, pesoJovenes = 0, pesoAdultos = 0, pesoAncianos = 0;
        int countNiños = 0, countJovenes = 0, countAdultos = 0, countAncianos = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Persona " + i + ":");
            System.out.println("Seleccione la edad de la persona");
            int edad = scanner.nextInt();
            System.out.println("Seleccion el peso de la persona (en kg)");
            double peso = scanner.nextDouble();

            if (edad <=12) {
                pesoNiños += peso;
                countNiños++;
            }

            else if (edad > 12 && edad <= 29) {
                pesoJovenes += peso;
                countJovenes++;
            }

            else if (edad > 29 && edad <= 59) {
                pesoAdultos += peso;
                countAdultos++;
            }

            else if (edad > 59) {
                pesoAncianos += peso;
                countAncianos++;
            }
        }

            System.out.println("\nResultados de peso por grupo:");
            System.out.println("Niños: " + (countNiños > 0 ? (pesoNiños / countNiños) + "kg" : "No hay datos"));
            System.out.println("Niños: " + (countJovenes > 0 ? (pesoJovenes / countJovenes) + "kg" : "No hay datos"));
            System.out.println("Niños: " + (countAdultos > 0 ? (pesoAdultos / countAdultos) + "kg" : "No hay datos"));
            System.out.println("Niños: " + (countAncianos > 0 ? (pesoAncianos / countAncianos) + "kg" : "No hay datos"));
    }

    public void Ejercicio53() {
        int[] totalVenezolanos = new int[4];
        int extranejerosEdadImpar = 0;
        int sumaEdades = 0;
        int contadorEmpleados = 0;
        double sumaSalarios = 0.0;

        int salir;
        scanner.nextLine();
        do {
            System.out.println("Ingrese el nombre del empleado");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la nacionalidad del empleado (Venezolana o Extranjera)");
            String nacionalidad = scanner.nextLine().toLowerCase();
            System.out.println("Ingrese la edad del empleado");
            int edad = scanner.nextInt();
            System.out.println("Ingrese el tipo de empleado (1, 2 o 3)");
            int tipo = scanner.nextInt();
            System.out.println("Ingrese el numero de horas trabajadas");
            int horas = scanner.nextInt();

            int tarifa = switch (tipo) {
                case 1 -> 5000;
                case 2 -> 10000;
                case 3 -> 15000;
                default -> 0;
            };
            
            int sueldoBruto = horas * tarifa;
            double seguro = (sueldoBruto > 100000) ? sueldoBruto * 0.03 : 0;
            double sueldoNeto = sueldoBruto - seguro;

            System.out.println("===========================================");
            System.out.println("Empleado: " + nombre);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Edad: " + edad);
            System.out.println("Tipo de empleado: " + tipo);
            System.out.println("Horas trabajadas: " + horas);
            System.out.println("Tarifa por hora: " + tarifa);
            System.out.println("Sueldo bruto: bs. " + sueldoBruto);
            System.out.println("Seguro: bs. " + seguro);
            System.out.println("Sueldo neto: bs. " + sueldoNeto);
            System.out.println("===========================================");

            if (nacionalidad.equals("venezolana")) {
                totalVenezolanos[tipo]++;
            } else if (nacionalidad.equals("extranjera")) {
                extranejerosEdadImpar++;
            }

            sumaEdades += edad;
            sumaSalarios += sueldoNeto;
            contadorEmpleados++;

            System.out.println("Ingrese 0 para salir o cualquier otro numero para continuar");
            salir = scanner.nextInt();
            scanner.nextLine();
        } while (salir != 0);
        
        System.out.println("\n ------------ RESULTADOS ------------");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Total de empleados tipo " + i + ": " + totalVenezolanos[i]);
        }
        System.out.println("Total de empleados extranjeros con edad impar: " + extranejerosEdadImpar);
        System.out.println("Promedio de edad de los empleados: " + (contadorEmpleados > 0 ? (double) sumaEdades / contadorEmpleados : 0));
        System.out.println("Total general a pagar en salarios: bs. " + sumaSalarios);
    }
    
    public void Ejercicio54() {
        final int NUM_CUESTIONARIOS = 64;
        final int NUM_PREGUNTAS = 23;
        double[] promedios = new double[NUM_CUESTIONARIOS];
        double sumaTotal = 0.0;
        double mayorPromedio = -1;
        double menorPromedio = 6;
        int indiceMayor = -1;
        int indiceMenor = -1;
        int conteoMenor3 = 0;
        int conteoMayor4 = 0;
        int conteoEntre4_5y5 = 0;

        for (int i = 0; i < NUM_CUESTIONARIOS; i++) {
            System.out.println("Cuestionario " + (i + 1) + ":" );
            int suma = 0;

            for (int j = 0; j < NUM_PREGUNTAS; j++) {
                int respuesta;
                while (true) {
                    System.out.println("Pregunta " + (j + 1) + ": (1-5)");
                    respuesta = scanner.nextInt();
                    if (respuesta >= 1 && respuesta <= 5) {
                        break;
                    } else {
                        System.out.println("Respuesta invalida. Deber ser un numero entre 1 y 5.");
                    }
                }
                suma += respuesta;
            }

            double promedio = (double) suma / NUM_PREGUNTAS;
            promedios[i] = promedio;
            sumaTotal += promedio;

            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                indiceMayor = i + 1;
            }

            if (promedio < menorPromedio) {
                menorPromedio = promedio;
                indiceMenor = i + 1;
            }

            if (promedio < 3) conteoMenor3++;
            if (promedio > 4) conteoMayor4++;
            if (promedio >= 4.5 && promedio <= 5) conteoEntre4_5y5++;

            // Print each promedio to use the array
            System.out.printf("Promedio del cuestionario #%d: %.2f\n", i + 1, promedios[i]);
        }

            double promedioGeneral = sumaTotal / NUM_CUESTIONARIOS;
            double porcentajeMenor3_vsMayor4 = (conteoMayor4 != 0) ? ((double)conteoMenor3 / conteoMayor4) * 100 : 0;
            double porcentajeEntre4_5y5 = ((double)conteoEntre4_5y5 / NUM_CUESTIONARIOS) * 100;

             System.out.println("\n📊 Resultados finales:");
        System.out.printf("a. Promedio general: %.2f\n", promedioGeneral);
        System.out.printf("b. Promedio más alto: %.2f (Cuestionario #%d)\n", mayorPromedio, indiceMayor);
        System.out.printf("c. Promedio más bajo: %.2f (Cuestionario #%d)\n", menorPromedio, indiceMenor);
        System.out.printf("d. %% Cuestionarios < 3 respecto a > 4: %.2f%%\n", porcentajeMenor3_vsMayor4);
        System.out.printf("e. %% Cuestionarios entre 4.5 y 5: %.2f%%\n", porcentajeEntre4_5y5);
    } 
}