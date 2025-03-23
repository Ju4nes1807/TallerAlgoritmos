import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ControlDecision {
    private final Scanner scanner;
    private final DecimalFormat df;

    public ControlDecision(Scanner scanner, DecimalFormat df) {
        this.scanner = scanner;
        this.df = df;
    }

    public void Ejercicio24() {
        System.out.println("Ingrese su capital inicial");
       int CapInicial = scanner.nextInt();
       System.out.println("Ingrese la cantidad de años");
       int Años = scanner.nextInt();
       System.out.println("Ingrese el tipo de capitalizacion");
       int Capitalizacion = scanner.nextInt();
       System.out.println("Ingrese la tasas de interes anual");
       double Interes = scanner.nextDouble();

       double MontoFinal = CapInicial * Math.pow(1 + (Interes / Capitalizacion), Capitalizacion * Años);
       double InteresesGenerados = MontoFinal - CapInicial;
       System.out.println("==========================================");
       System.out.println("Los interese genarados fueron: " + df.format(InteresesGenerados));
       System.out.println("=================================================");

       if (InteresesGenerados > 7000) {
        System.out.println("Los intereses superaron los 7000 asi que se reinvierten nuevamente");
        CapInicial = (int) MontoFinal;
        MontoFinal = CapInicial * Math.pow(1 + (Interes / Capitalizacion), Capitalizacion * Años);
        System.out.println("=========================================");
        System.out.println("El nuevo saldo de reinversion es: " + df.format(MontoFinal));
        System.out.println("=================================================");
       } else {
        System.out.println("Los intereses no seran reinvertidos");
       }
    }

    public void Ejercicio25() {
        System.out.println("Ingrese el valor de a");
        int a = scanner.nextInt();
        System.out.println("Ingrese el valor de b");
        int b = scanner.nextInt();
        System.out.println("Ingrese el valor de c");
        int c = scanner.nextInt();
        System.out.println("ingrese el valor de d");
        int d = scanner.nextInt();

        if (d == 0) {
           double Resultado1 = Math.pow((a - c), 2);
           System.out.println("=========================================");
            System.out.println("El resultado de d = 0 es: " + df.format(Resultado1));
            System.out.println("==========================================");
        } else if (d > 0) {
           double Resultado2 = Math.pow ((a - b), 3) / d;
           System.out.println("=========================================");
            System.out.println("El resultado de d > 0 es: " + df.format(Resultado2));
            System.out.println("=======================================");
        }
   }

   public void Ejercicio26() {
        System.out.println("Ingrese su sueldo");
        int Sueldo = scanner.nextInt();
        double aumento = (Sueldo * 0.15) + Sueldo;
        double aumento2 = (Sueldo * 0.12) + Sueldo;

        if (Sueldo < 40000) {
            System.out.println("=====================================");
            System.out.println("Su nuevo sueldo es: " + df.format(aumento));
            System.out.println("===========================================");
        } else if (Sueldo >= 40000) {
            System.out.println("=====================================");
            System.out.println("Su nuevo sueldo es: " + df.format(aumento2));
            System.out.println("=====================================");
        }
   }

   public void Ejercicio27() {
        System.out.println("Ingrese el valor1");
        int Valor1 = scanner.nextInt();
        System.out.println("Ingrese el valor2");
        int Valor2 = scanner.nextInt();
        System.out.println("Ingrese el valor3");
        int Valor3 = scanner.nextInt();

         int Triangulo = (Valor1 * Valor2) / 2;
         double Circulo = Math.pow(Valor2, 2) * Valor1;
         int Rectangulo = Valor1 * Valor2;

        if (Triangulo == Valor3) {
            System.out.println("=========================");
            System.out.println("La figura es un triangulo");
            System.out.println("=========================");
        } else if (Circulo == Valor3) {
            System.out.println("=========================");
            System.out.println("La figura es un circulo");
            System.out.println("=========================");
        } else if (Rectangulo == Valor3) {
            System.out.println("=========================");
            System.out.println("La figura es un rectangulo");
            System.out.println("=========================");
        }
   }

   public void Ejercicio28() {
        System.out.println("Ingrese el precio de la compra");
        int PrecioCompra = scanner.nextInt();

        if (PrecioCompra > 500000) {
            double Inversion = PrecioCompra * 0.55;
            double Prestamo = PrecioCompra * 0.30;
            double Credito = PrecioCompra * 0.15;
            double Interes = Credito * 0.20;
            System.out.println("===================================================");
            System.out.println("La inversion propia fue de: " + df.format(Inversion));
            System.out.println("El prestamo del banco fue: " + df.format(Prestamo));
            System.out.println("El credito con el fabricante fue de: " + df.format(Credito));
            System.out.println("El interes aplicado sobre el credito es de: " +df.format(Interes));
            System.out.println("=============================================================");
        } else if (PrecioCompra <= 500000) {
            double Inversion2 = PrecioCompra * 0.70;
            double Credito2 = PrecioCompra * 0.30;
            double Interes2 = Credito2 * 0.20;
            System.out.println("==========================================");
            System.out.println("La inversion propia fue de: " + df.format(Inversion2));
            System.out.println("El credito con el fabricante fue de: " + df.format(Credito2));
            System.out.println("El interes aplicado sobre el credito es: " + df.format(Interes2));
            System.out.println("==========================================");
        }
   }

   public void Ejercicio29() {
    System.out.println("Ingrese el sueldo de los trabajadores:");
    double SueldoBase = scanner.nextDouble();

    System.out.println("Ingrese las ventas de los departamentos (1,2,3):");
    double VentasDep1 = scanner.nextDouble();
    double VentasDep2 = scanner.nextDouble();
    double VentasDep3 = scanner.nextDouble();

    double VentasTotales = VentasDep1 + VentasDep2 + VentasDep3;

    double PorcentajeDep1 = (VentasDep1 / VentasTotales) * 100;
    double PorcentajeDep2 = (VentasDep2 / VentasTotales) * 100;
    double PorcentajeDep3 = (VentasDep3 / VentasTotales) * 100;

    double SalarioDep1 = SueldoBase;
    double SalarioDep2 = SueldoBase;
    double SalarioDep3 = SueldoBase;

    if (PorcentajeDep1 > 33) {
        SalarioDep1 = SueldoBase * 1.2;
    }
    if (PorcentajeDep2 > 33) {
        SalarioDep2 = SueldoBase * 1.2;
    }
    if (PorcentajeDep3 > 33) {
        SalarioDep3 = SueldoBase * 1.2;
    }

    System.out.println("\n--- Resultados ---");
    System.out.println("=========================================================");
    System.out.println("Cada vendedor del Departamento 1 recibirá: $" + df.format(SalarioDep1));
    System.out.println("Cada vendedor del Departamento 2 recibirá: $" + df.format(SalarioDep2));
    System.out.println("Cada vendedor del Departamento 3 recibirá: $" + df.format(SalarioDep3));
    System.out.println("=============================================================");
   }

   public void Ejercicio30() { 
        System.out.println("Ingrese el Valor A (miles)");
        int A = scanner.nextInt();
        System.out.println("Ingrese el valor B (Centenas)");
        int B = scanner.nextInt();
        System.out.println("Ingrese el valor C (Decenas)");
        int C = scanner.nextInt();
        System.out.println("Ingrese el valor D (Unidades)");
        int D = scanner.nextInt();

        int N = (A * 1000) + (B * 100) + (C * 10) + D;
        System.out.println("El numero ingresado es " + N);
        int CentRedondeada;

        if (C >= 5) {
            CentRedondeada = ((N / 100) + 1) * 100;
        } else {
            CentRedondeada = (N / 100) * 100;
        }
        System.out.println("=============================================================");
        System.out.println("El numero redondeado a la centena mas cercana es: " + CentRedondeada);
        System.out.println("=============================================================");
   }

   public void Ejercicio31() {
        int TarifaBase = 5000;
        System.out.println("Ingrese la distancia recorrida");
        int Distancia = scanner.nextInt();

        if (Distancia <= 300) {
            System.out.println("=================================================");
            System.out.println("Su total a pagar es: " + TarifaBase);
            System.out.println("=================================================");
        } else if (Distancia <= 1000) {
            int CostoExtra = (Distancia - 300) * 200;
            int TarifaPlus = TarifaBase + CostoExtra;
            System.out.println("=================================================");
            System.out.println("Su tarifa extra al total del KM recorridos son: " +TarifaPlus);
            System.out.println("=================================================");
        } else {
            int Costo300_1000 = (1000 - 300) * 200;
            int Costo_1000 = (Distancia - 1000) * 150;
            int TarifaPlus1000 = TarifaBase + Costo300_1000 + Costo_1000;
            System.out.println("=================================================");
            System.out.println("Su tarifa al exceder los 1000km son: " +TarifaPlus1000);
            System.out.println("=================================================");
        }
   }

   public void Ejercicio32() {
        System.out.println("Ingrese el valor de P");
        int P = scanner.nextInt();
        System.out.println("Ingrese el valor de Q");
        int Q = scanner.nextInt();
        int resultado = (int) (Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2));

        if (resultado > 680) {
            System.out.println("=================================================");
            System.out.println("Los valores P " + P + "Y Q " + Q + "Satisfacen la expresion");
            System.out.println("=================================================");
        } else {
            System.out.println("=================================================");
            System.out.println("Los valores no cumplen la condicion");
            System.out.println("=================================================");
        }
   }

   public void Ejercicio33() {
        System.out.println("Ingrese el precio de la compra");
        int Compra = scanner.nextInt();
        
        if (Compra < 500) {
            System.out.println("=================================================");
            System.out.println("Su compra no tiene descuento"); 
            System.out.println("=================================================");
        } else if (Compra >= 500 && Compra <= 1000) {
           double Descuento = Compra - (Compra * 0.05);
           System.out.println("================================================="); 
           System.out.println("Su compra con descuento aplicado es: " + df.format(Descuento));
           System.out.println("=================================================");
        } else if (Compra >=1000 && Compra <= 7000) {
            double Descuento2 = Compra - (Compra * 0.11);
            System.out.println("=================================================");
            System.out.println("Su compra con descuento aplicado es: " + df.format(Descuento2));
            System.out.println("=================================================");
        } else if (Compra >= 7000 && Compra <= 15000) {
            double Descuento3 = Compra - (Compra * 0.18);
            System.out.println("=================================================");
            System.out.println("Su compra con descuento aplicado es: " + df.format(Descuento3));
            System.out.println("=================================================");
        } else {
            double Descuento4 = Compra - (Compra * 0.25);
            System.out.println("=================================================");
            System.out.println("Su compra con descuento aplicado es: " + df.format(Descuento4));
            System.out.println("=================================================");
        }
   }

   public void Ejercicio34() {
        System.out.println("Ingrese su categoria");
        int categoria = scanner.nextInt();
        System.out.println("Ingrese su sueldo");
        int sueldo = scanner.nextInt();

        switch (categoria) {
            case 1 -> {
                double aumento1 = (sueldo * 0.15) + sueldo;
                System.out.println("=================================================");
                System.out.println("Trabajador (1) Su sueldo aumentado es: " + df.format(aumento1));
                System.out.println("=================================================");
            }
            case 2 -> {
                double aumento2 = (sueldo * 0.10) + sueldo;
                System.out.println("=================================================");
                System.out.println("Trabajador (2) Su sueldo aumentado es: " + df.format(aumento2));
                System.out.println("=================================================");
            }
            case 3 -> {
                double aumento3 = (sueldo * 0.08) + sueldo;
                System.out.println("=================================================");
                System.out.println("Trabajador (3) Su sueldo aumentado es: " + df.format(aumento3));
                System.out.println("=================================================");
            }
            case 4 -> {
                double aumento4 = (sueldo * 0.07) + sueldo;
                System.out.println("=================================================");
                System.out.println("Trabajador (4) Su sueldo aumentado es: " + df.format(aumento4));
                System.out.println("=================================================");
            }
            default -> System.out.println("Categoria no valida");
        }
   }

   public void Ejercicio35() {
        System.out.println("Ingrese la temperatura en Grados Fahrenheit");
        int temperatura = scanner.nextInt();

        if (temperatura > 85) {
            System.out.println("El deporte apropiado para esta temperatura es Natacion");
        } else if (temperatura > 70 && temperatura < 85) {
            System.out.println("El deporte adecuado para la temperatura es Tenis");
        } else if (temperatura > 32 && temperatura < 70) {
            System.out.println("El deporte adecuado para esta temperatura es Golf");
        } else if (temperatura > 10 && temperatura < 32) {
            System.out.println("El deporte adecuado para esta temperatura es Esqui");
        } else {
            System.out.println("El deporte adecuado para esta temperatura es Marcha");
        }
   }

   public void Ejercicio36() {
        System.out.println("Ingrese la cantidad en Bs");
        int Cantidad = scanner.nextInt();
        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};

        for (int billete : billetes) {
            int CantBilletes = Cantidad / billete;
            if (CantBilletes > 0) {
                System.out.println("Billetes de " + billete + "Bs: " + CantBilletes);
                Cantidad %= billete;
            }
        } if (Cantidad > 0) {
            System.out.println("Sobrante no desglosado: " + Cantidad + "Bs");
        }
   }

   public void Ejercicio37() {
        System.out.println("Ingrese su dia de nacimiento (1 - 31)");
        int Dia = scanner.nextInt();
        System.out.println("ingrese el mes (1 - 12)");
        int Mes = scanner.nextInt();
        System.out.println("Ingrese el año");
        int Año = scanner.nextInt();
        String signo = obtenerSignoZodiaco(Dia, Mes);
        int edad = calcularEdad(Dia, Mes, Año);
        System.out.println("================================");
        System.out.println("Su signo zodiacal es: " + signo);
        System.out.println("Su edad es: " + edad + " años");
        System.out.println("================================");
   }

   public static String obtenerSignoZodiaco(int Dia, int Mes) {
        String signo = "";

        if ((Mes == 1 && Dia >= 20) || (Mes == 2 && Dia <= 18)) {
            signo = "Acuario";
        } else if ((Mes == 2 && Dia >= 19) || (Mes == 3 && Dia <= 20)) {
            signo = "Piscis";
        } else if ((Mes == 3 && Dia >= 21) || (Mes == 4 && Dia <= 19)) {
            signo = "Aries";
        } else if ((Mes == 4 && Dia >= 20) || (Mes == 5 && Dia <= 20)) {
            signo = "Tauro";
        } else if ((Mes == 5 && Dia >= 21) || (Mes == 6 && Dia <= 20)) {
            signo = "Géminis";
        } else if ((Mes == 6 && Dia >= 21) || (Mes == 7 && Dia <= 22)) {
            signo = "Cáncer";
        } else if ((Mes == 7 && Dia >= 23) || (Mes == 8 && Dia <= 22)) {
            signo = "Leo";
        } else if ((Mes == 8 && Dia >= 23) || (Mes == 9 && Dia <= 22)) {
            signo = "Virgo";
        } else if ((Mes == 9 && Dia >= 23) || (Mes == 10 && Dia <= 22)) {
            signo = "Libra";
        } else if ((Mes == 10 && Dia >= 23) || (Mes == 11 && Dia <= 21)) {
            signo = "Escorpio";
        } else if ((Mes == 11 && Dia >= 22) || (Mes == 12 && Dia <= 21)) {
            signo = "Sagitario";
        } else if ((Mes == 12 && Dia >= 22) || (Mes == 1 && Dia <= 19)) {
            signo = "Capricornio";
        }

        return signo;
   }
    public static int calcularEdad(int Dia, int Mes, int Año) {
    LocalDate fechaNacimiento = LocalDate.of(Año, Mes, Dia);
    LocalDate fechaActual = LocalDate.now();
    return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public void Ejercicio38() {
        System.out.println("Ingrese el valor de A");
        int A = scanner.nextInt();
        System.out.println("Ingrese el valor de B");
        int B = scanner.nextInt();
        System.out.println("Ingrese el valor de C");
        int C = scanner.nextInt();
        int S = (A + B + C) / 2;
        double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
        System.out.println("========================================");
        System.out.println("El area del triangulo es " + df.format(area));
        System.out.println("========================================");

        if (A + B > C && A + C > B && B + C > A) {
        } if ( A == B && B == C) {
            System.out.println("========================================");
            System.out.println("El triangulo es Equilatero");
            System.out.println("========================================");
        } else if (A == B || A == C || B == C) {
            System.out.println("========================================");
            System.out.println("El triangulo es isoceles");
            System.out.println("========================================");
        } else {
            System.out.println("========================================");
            System.out.println("El triangulo es Escaleno");
            System.out.println("========================================");
        }
    } 

    public void Ejercicio39() {
        System.out.println("ingrese el precio del auto y del terreno");
        int precio = scanner.nextInt();
        System.out.println(" Ingrese la devaluacion del auto");
        double DevAuto = scanner.nextDouble();
        System.out.println("Ingrese la apreciacion del terreno");
        double ApTerreno = scanner.nextDouble();
        double ValorAuto = precio * Math.pow ((1 - DevAuto), 3);
        double ValorTerreno = precio * Math.pow ((1 + ApTerreno), 3);

        if ((precio - ValorAuto) <= (0.5 * (ValorTerreno - precio))) {
            System.out.println("==============================");
            System.out.println("Comprar el automovil");
            System.out.println("================================");
        } else {
            System.out.println("================================");
            System.out.println("Comprar el terreno");
            System.out.println("================================");
        }
    }

    public void Ejercicio40() {
        System.out.println("ingrese la lectura actual");
        double LecActual = scanner.nextDouble();
        System.out.println("ingrese la lectura anterior");
        double LecAnterior = scanner.nextDouble();
        double Consumo = LecActual - LecAnterior;
        double Monto;

        if (Consumo <= 100) {
            Monto = 2622;
        } else if (Consumo <= 300) {
            Monto = 2622 + (Consumo - 100) * 79.78;
        } else if (Consumo <= 500) {
            Monto = 2622 + (200 * 79.78) + (Consumo - 300) * 89.52;
        } else {
            Monto = 2622 + (200 * 79.78) + (200 * 89.52) + (Consumo - 500) * 97.95;
        }
       Monto += 150;
       System.out.println("=====================================");
       System.out.println("Su consumo fue de: " + Consumo + " Kwh");
       System.out.println("Monto a pagar es: " + Monto + " Bs");
       System.out.println("=====================================");
    }

    public void Ejercicio41() {
        System.out.println("Ingrese el numero de hectareas");
        double Hectareas = scanner.nextDouble();
        double MetrosCuadrados = Hectareas * 10000;
        double PorPino, PorOyamel, PorCedro;

        if (MetrosCuadrados >= 1000000) {
            PorPino = 0.70;
            PorOyamel = 0.20;
            PorCedro = 0.10;
        } else {
            PorPino = 0.50;
            PorOyamel = 0.30;
            PorCedro = 0.20;
        }

        double areaPino = MetrosCuadrados * PorPino;
        double areaOyamel = MetrosCuadrados * PorOyamel;
        double areaCedro = MetrosCuadrados * PorCedro;

        double densidadPino = 8.0 / 10;   
        double densidadOyamel = 15.0 / 15; 
        double densidadCedro = 10.0 / 18;

        int numPinos = (int) (areaPino * densidadPino);
        int numOyameles = (int) (areaOyamel * densidadOyamel);
        int numCedros = (int) (areaCedro * densidadCedro);
        System.out.println("=====================================");
        System.out.println("\nPara " + Hectareas + " hectáreas, se deben sembrar:");
        System.out.println("- " + numPinos + " pinos");
        System.out.println("- " + numOyameles + " oyameles");
        System.out.println("- " + numCedros + " cedros");
        System.out.println("=====================================");
    }

    public void Ejercicio42() {
        System.out.println("Ingrese la edad en meses: ");
        int edadMeses = scanner.nextInt();

        char sexo = 'X'; 
        if (edadMeses > 180) {
            System.out.println("Ingrese el sexo (M para masculino, F para femenino): ");
            sexo = scanner.next().toUpperCase().charAt(0);
        }

        System.out.println("Ingrese el nivel de hemoglobina (g%): ");
        double hemoglobina = scanner.nextDouble();

        double minHemoglobina;

        if (edadMeses >= 0 && edadMeses <= 1) {
            minHemoglobina = 13;
        } else if (edadMeses > 1 && edadMeses <= 6) {
            minHemoglobina = 10;
        } else if (edadMeses > 6 && edadMeses <= 12) {
            minHemoglobina = 11;
        } else if (edadMeses > 12 && edadMeses <= 60) { 
            minHemoglobina = 11.5;
        } else if (edadMeses > 60 && edadMeses <= 120) { 
            minHemoglobina = 12.6;
        } else if (edadMeses > 120 && edadMeses <= 180) { 
            minHemoglobina = 13;
        } else if (edadMeses > 180) { 
            switch (sexo) {
                case 'M' -> {
                    minHemoglobina = 14;
                }
                case 'F' -> {
                    minHemoglobina = 12;
                }
                default -> {
                    System.out.println("Sexo inválido para mayores de 15 años.");
                    return;
                }
            }
        } else {
            System.out.println("Edad inválida.");
            return;
        }

        if (hemoglobina < minHemoglobina) {
            System.out.println("=========================================");
            System.out.println("Diagnóstico: POSITIVO para anemia.");
            System.out.println("=========================================");
        } else {
            System.out.println("=========================================");
            System.out.println("Diagnóstico: NEGATIVO para anemia.");
            System.out.println("=========================================");
        }
    }

    public void Ejercicio43() {
        System.out.println("Ingrese su Capital");
        int Capital = scanner.nextInt();
        int NuevoSaldo, EquipoComputo = 5000, Mobiliario = 2000, insumos, incetivos, prestamo;
 
        if (Capital < 0) {
            prestamo = 10000 - Capital;
            NuevoSaldo = 10000;
        } else if (Capital <= 20000) {
            prestamo = 20000 - Capital;
            NuevoSaldo = 20000;
        } else {
            prestamo = 0;
            NuevoSaldo = Capital;
        }

       int restante = NuevoSaldo - (EquipoComputo + Mobiliario);

       if (restante > 0) {
            insumos = restante / 2;
            incetivos = restante / 2;
       } else {
        insumos = 0;
        incetivos = 0;
       }
       System.out.println("=====================================================================");
       System.out.println("El prestamo necesario fue de: " + prestamo);
       System.out.println("Los gastos para los insumos seran de: " + insumos + " y de incentivos: " + incetivos);
       System.out.println("=========================================================================");
    }

    public void Ejercicio44() {
        System.out.println("Ingrese el monto de la hipoteca de la casa");
        float MontoHipoteca = scanner.nextFloat();
        System.out.println("Ingrese el monto de la inversion total");
        float Inversion = scanner.nextFloat();
        float Inversion_Persona, Inversion_Socio, Faltante = 0;

        if (MontoHipoteca < 1000000) {
            Inversion_Persona = Inversion / 2;
        } else {
            Inversion_Persona = MontoHipoteca;
            Faltante = Inversion - MontoHipoteca;
        }

        if (Faltante > 0) {
            float Extra_Aporte = Faltante / 2;
            Inversion_Persona += Extra_Aporte;
            Inversion_Socio = Extra_Aporte;
        } else {
            Inversion_Socio = 0;
        }

        System.out.println("Inversion de la persona: " + Inversion_Persona);
        System.out.println("Inversion del socio " + Inversion_Socio);

    }
}