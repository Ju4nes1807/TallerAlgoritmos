import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlSecuencial { 
    private final Scanner scanner;
    private final DecimalFormat df;
    
    public ControlSecuencial(Scanner scanner, DecimalFormat df) {
       this.scanner = scanner;
       this.df = df;
    } 

public void Ejercicio1() {
    System.out.println("Ingrese las edades de las personas");

    int edad1 = scanner.nextInt();
    int edad2 = scanner.nextInt();
    int edad3 = scanner.nextInt();
    System.out.println("==============================================");
    System.out.println("El promedio de las edades es " + (edad1 + edad2 + edad3) / 3);
    System.out.println("==============================================");
}

public void Ejercicio2() {
    int capital = scanner.nextInt();
    double interes = capital * 0.02;
    System.out.println("==============================================");
    System.out.println("El interes de ganancia en un mes es " + interes);
    System.out.println("==============================================");
}

public void Ejercicio3() {
    System.out.println("Ingrese su sueldo");
    int Sueldo = scanner.nextInt();
    System.out.println("Ingrese las comisiones ");
    int Venta1 = scanner.nextInt();
    int Venta2 = scanner.nextInt();
    int Venta3 = scanner.nextInt();
    double ComisionTotal = (Venta1 + Venta2 + Venta3) * 0.10;
    System.out.println("==============================================");
    System.out.println("El sueldo mas comisiones es" + (Sueldo + ComisionTotal));
    System.out.println("==============================================");
 }

 public void Ejercicio4() {
    System.out.println("Ingrese el precio de la compra");
    int Compra = scanner.nextInt();
    int PrecioFinal = (int) (Compra * (1 - 0.15));
    System.out.println("==============================================");
    System.out.println("El precio final es " + PrecioFinal);
    System.out.println("==============================================");
     }

 public void Ejercicio5(){
    System.out.println("Ingrese la nota de los tres parciales, el examen final y el trabajo final");
    int CalPar1 = scanner.nextInt();
    int CalPar2 = scanner.nextInt();
    int CalPar3 = scanner.nextInt();
    int CalEF = scanner.nextInt();
    int CalTF = scanner.nextInt();
    int NotaFinal = (int) (((CalPar1 + CalPar2 + CalPar3) * 0.55 / 3) + (CalEF * 0.30) + (CalTF * 0.15));
    System.out.println("==============================================");
    System.out.println("La nota final es " + NotaFinal);
    System.out.println("==============================================");
  }

public void Ejercicio6() {
    System.out.println("Ingrese la cantidad total del grupo");
    int CantGrupo = scanner.nextInt();
    System.out.println("Ingrese la cantidad de hombres");
    int CantHombres = scanner.nextInt();
    System.out.println("Ingrese la cantidad de mujeres");
    int CantMujeres = scanner.nextInt();
    System.out.println("==============================================");
    System.out.println("Porcentaje de hombres " + df.format(((double)CantHombres / CantGrupo) * 100) + "%");
    System.out.println("Porcentaje de mujeres " + df.format(((double)CantMujeres / CantGrupo) * 100) + "%");
    System.out.println("==============================================");  
 }

 public void Ejercicio7(){
    double metros = scanner.nextDouble();
    double pulgadas = metros * 39.27;
    double pies = pulgadas / 12;
    System.out.println("==============================================");
    System.out.println("Equivalencia " + pulgadas + "Pulgadas " + pies + "Pies");
    System.out.println("==============================================");
}

public void Ejercicio8() {
    double a, b, c, p;
        double AreaTriangulo;
            System.out.println("Ingrese el valor de a");
            a = scanner.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = scanner.nextDouble();
            System.out.println("Ingrese el valor de c");
            c = scanner.nextDouble();
        p = (a + b + c) / 2;
        AreaTriangulo = Math.sqrt (p * (p -a) * (p - b) * (p - c));
        System.out.println("==============================================");
        System.out.println("El area del triangulo es: " + AreaTriangulo);
        System.out.println("==============================================");
 }

 public void Ejercicio9() {
    int SalarioBase, SalarioHora, SalarioNeto;
    double CanImpuestos;  
    System.out.println("Ingrese el salario base");
    SalarioBase = scanner.nextInt();
    CanImpuestos = SalarioBase * 0.20;
    SalarioNeto = (int) (SalarioBase - CanImpuestos);
    SalarioHora = SalarioNeto / 160;
    System.out.println("==============================================");
    System.out.println("El salario neto es: " + SalarioNeto + " y el salario por hora es: " + SalarioHora);
    System.out.println("==============================================");
}

public void Ejercicio10() {
    int Chelines, Dracmas, Pesetas;
    double TasaPeseta = 6.5, TasaFranco = 0.02, TasaDolar = 0.006, TasaLira = 0.008;
    double Peseta, Franco, Dolar, Lira;
    System.out.println("Ingrese la cantidad de chelines que quieren convertir a pesetas");
    Chelines = scanner.nextInt();
    System.out.println("Ingrese la cantidad de dracmas que quieren convertir a francos");
    Dracmas = scanner.nextInt();
    System.out.println("Ingrese la cantidad de pesetas que quieren convertir a dolares y liras");
    Pesetas = scanner.nextInt();
    Peseta = Chelines * TasaPeseta;
    Franco = Dracmas * TasaFranco;
    Dolar = Pesetas * TasaDolar;
    Lira = Pesetas * TasaLira;
    System.out.println("==============================================");
    System.out.println("La cantidad de chelines ingresada a pesetas es " + Peseta);
    System.out.println("La cantidad de dracmas ingresada a francos es " + Franco);
    System.out.println("La cantidad de pesetas ingresada a dolares es " + Dolar + " y a liras es " + Lira);
    System.out.println("==============================================");
}

public void Ejercicio11() {
    String Nombre;
    int HorasNorTrab , PagoHoraNor, HorasExtTrab, NumHijos;
    double SueldoBase, PagoHorExt, ParoFor, PolHab, CajAho, TotalDec;
    int ActAcd = 25000, AsgHij, PrimaHog = 18000, TotAsg;
    double SueldoNeto;
        System.out.println("Ingrese su nombre");
        Nombre = scanner.nextLine();
        System.out.println("Ingrese el numero de horas normales trabajadas");
        HorasNorTrab = scanner.nextInt();
        System.out.println("Ingrese su pago por hora normal");
        PagoHoraNor = scanner.nextInt();
        System.out.println("Ingrese su numero de horas trabajadas extras");
        HorasExtTrab = scanner.nextInt();
        System.out.println("Ingrese su numero de hijos");
        NumHijos = scanner.nextInt();
    SueldoBase = HorasNorTrab * PagoHoraNor;
    PagoHorExt = HorasExtTrab * (PagoHoraNor * 1.25);
    ParoFor = SueldoBase * 0.05;
    PolHab = SueldoBase * 0.02;
    CajAho = SueldoBase * 0.07;
    TotalDec = ParoFor + PolHab + CajAho;
    AsgHij = NumHijos * 17300;
    TotAsg = ActAcd + AsgHij + PrimaHog;
    SueldoNeto = (SueldoBase + PagoHorExt + TotAsg) - TotalDec;
    System.out.println("==============================================");
    System.out.println("Su nombre es " + Nombre);
    System.out.println("Su sueldo base por dia es " + SueldoBase +  "Bs");
    System.out.println("Su pago por horas extras es " + PagoHorExt +  "Bs");
    System.out.println("Su deduccion por paro forzoso es " + ParoFor +  "Bs");
    System.out.println("Su deduccion por politica habitacional es " + PolHab +  "Bs");
    System.out.println("Su deduccion por caja de ahorro es " + df.format(CajAho) + "Bs");
    System.out.println("Su total de deducciones es " + TotalDec +  "Bs");
    System.out.println("Su asignacion por hijo es " + AsgHij +  "Bs");
    System.out.println("Su total de asignaciones es " + TotAsg +  "Bs");
    System.out.println("Su sueldo neto es " + df.format(SueldoNeto) + "Bs");
    System.out.println("==============================================");
}

public void Ejercicio12() {
    double ExamenMat, ExamenFis, ExaemnQui;
    double PromExamMat, PromExamFis, PromExamQui;
    double Tarea1Mat, Tarea2Mat, Tarea3Mat, PromTareasMat, PorTarMat;
    double TareaFis1,TareaFis2, PromTareasFis, PorTarFis;
    double Tarea1Qui, Tarea2Qui, Tarea3Qui, PromTareasQui, PorTarQui;
    double PromedioFinal, PromedioMat, PromedioFis, PromedioQui;
        System.out.println("Ingrese la nota del examen de matematicas");
        ExamenMat = scanner.nextDouble();
        System.out.println("Ingrese la nota del examen de fisica");
        ExamenFis = scanner.nextDouble();
        System.out.println("Ingrese la nota del examen de quimica");
        ExaemnQui = scanner.nextDouble();
        System.out.println("Ingrese las notas de las tareas de matematicas");
        Tarea1Mat = scanner.nextDouble();
        Tarea2Mat = scanner.nextDouble();
        Tarea3Mat = scanner.nextDouble();
        System.out.println("Ingrese las notas de las tareas de fisica");
        TareaFis1 = scanner.nextDouble();
        TareaFis2 = scanner.nextDouble();
        System.out.println("Ingrese las notas de las tareas de quimica");
        Tarea1Qui = scanner.nextDouble();
        Tarea2Qui = scanner.nextDouble();
        Tarea3Qui = scanner.nextDouble();
    PromExamMat = ExamenMat * 0.90;
    PromExamFis = ExamenFis * 0.80;
    PromExamQui = ExaemnQui * 0.85;
    PromTareasMat = (Tarea1Mat + Tarea2Mat + Tarea3Mat) / 3;
    PorTarMat = PromTareasMat * 0.10;
    PromTareasFis = (TareaFis1 + TareaFis2) / 2;
    PorTarFis = PromTareasFis * 0.20;
    PromTareasQui = (Tarea1Qui + Tarea2Qui + Tarea3Qui) / 3;
    PorTarQui = PromTareasQui * 0.15;
    PromedioMat = PromExamMat + PorTarMat;
    PromedioFis = PromExamFis + PorTarFis;
    PromedioQui = PromExamQui + PorTarQui;
    PromedioFinal = (PromedioMat + PromedioFis + PromedioQui) / 3;
    System.out.println("==============================================");
    System.out.println("Su promedio de matematicas es: " + df.format(PromedioMat));
    System.out.println("Su promedio de fisica es: " + df.format(PromedioFis));
    System.out.println("Su promedio de quimica es: " + df.format(PromedioQui));
    System.out.println("Su promedio final es: " + df.format(PromedioFinal));
    System.out.println("==============================================");
}

public void Ejercicio13() {
    long BillN1 = 50000, BillN2 = 20000, BillN3 = 10000, BillN4 = 5000, BillN5 = 2000, BillN6 = 1000, BillN7 = 500, BillN8 = 100;
    long CantN1, CantN2, CantN3, CantN4, CantN5, CantN6, CantN7, CantN8;
    long TotalDinero;
        System.out.println("Ingrese la cantidad de billetes de 50000");
        CantN1 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 20000");
        CantN2 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 10000");
        CantN3 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 5000");
        CantN4 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 2000");
        CantN5 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 1000");
        CantN6 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 500");
        CantN7 = scanner.nextLong();
        System.out.println("Ingrese la cantidad de billetes de 100");
        CantN8 = scanner.nextLong();
    TotalDinero = (CantN1 * BillN1) + (CantN2 * BillN2) + (CantN3 * BillN3) + (CantN4 * BillN4) + (CantN5 * BillN5) + (CantN6 * BillN6) + (CantN7 * BillN7) + (CantN8 * BillN8);
    System.out.println("==============================================");
    System.out.println("El total de dinero en el banco es: " + TotalDinero);
    System.out.println("==============================================");
}

public void Ejercicio14() {
    double a, b, c, d, e, f;
        double denominador;
        double ValorX = 0, ValorY = 0;
            System.out.println("Ingrese el valor de a");
            a = scanner.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = scanner.nextDouble();
            System.out.println("Ingrese el valor de c");
            c = scanner.nextDouble();
            System.out.println("Ingrese el valor de d");
            d = scanner.nextDouble();
            System.out.println("Ingrese el valor de e");
            e = scanner.nextDouble();
            System.out.println("Ingrese el valor de f");
            f = scanner.nextDouble();
        denominador = (double) (a * e) - (b * d);
        if (denominador == 0) {
            System.out.println("El sistema de ecuaciones no tiene solucion unica");
        } else {
            ValorX = (double) ((c * e) - (b * f)) / denominador;
            ValorY = (double) ((a * f) - (c * d)) / denominador;
        }
            System.out.println("==============================================");
            System.out.println("El valor de x es: " + ValorX);
            System.out.println("El valor de y es: " + ValorY);
            System.out.println("==============================================");
}

public void Ejercicio15(){
    int LecAnterior, LecActual, CostoKwh, Consumo, TotalPagar;
            System.out.println("Ingrese la lectura anterior en Khw");
            LecAnterior = scanner.nextInt();
            System.out.println("Ingrese la lectura actual en Kwh");
            LecActual = scanner.nextInt();
            System.out.println("Ingrese el costo por Kwh");
            CostoKwh = scanner.nextInt();
        Consumo = LecActual - LecAnterior;
        TotalPagar = Consumo * CostoKwh;
        System.out.println("==============================================");
        System.out.println("El Consumo de energia electrica es: " + Consumo + "KwH");
        System.out.println("El total a pagar es: " + TotalPagar);
        System.out.println("==============================================");
}

public void Ejercicio16() {
    double laminaLargo = 4, LaminaAncho = 1.5, ConsumoPieza = 0.5, AreaLamina;
        double PiezasFabricadas, Desperdicio;
        AreaLamina = (int) (LaminaAncho * laminaLargo);
        PiezasFabricadas = (int) (AreaLamina / ConsumoPieza);
        Desperdicio = (int) (AreaLamina - (PiezasFabricadas * ConsumoPieza));
        System.out.println("==============================================");
        System.out.println("Las piezas fabricadas son: " + PiezasFabricadas);
        System.out.println("El desperdicio es: " + Desperdicio);
        System.out.println("==============================================");
}

public void Ejercicio17() {
    double PrecioPagado, PrecioVenta, descuento;
            System.out.println("Ingrese el precio pagado");
            PrecioPagado = scanner.nextInt();
            System.out.println("Ingrese el precio de venta");
            PrecioVenta = scanner.nextInt();
        descuento = ((PrecioVenta - PrecioPagado) / PrecioVenta) * 100;
        System.out.println("==============================================");
        System.out.println("El descuento aplicado es de: " + descuento + "%");
        System.out.println("==============================================");
}

public void Ejercicio18() {
    double Galon = 3.785, PrecioLitro = 100;
    double PrecioGalon, NumGalones, TotalGalones;
            System.out.println("Ingrese el numero de galones");
            NumGalones = scanner.nextDouble();
    PrecioGalon = Galon * PrecioLitro;
    TotalGalones = NumGalones * PrecioGalon;
    System.out.println("==============================================");
    System.out.println("El precio del galon es: " + PrecioGalon + "Bs");
    System.out.println("El precio de todos los galones es: " + TotalGalones + "Bs");
    System.out.println("==============================================");
}

public void Ejercicio19() {
        BigInteger Presupuesto;
        BigInteger PorGinecologia, PorTraumatologia, PorPediatria;
            System.out.println("Ingrese el presupuesto anual");
            Presupuesto = scanner.nextBigInteger();
        PorGinecologia = Presupuesto.multiply(BigInteger.valueOf(40)).divide(BigInteger.valueOf(100));
        PorTraumatologia = Presupuesto.multiply(BigInteger.valueOf(30)).divide(BigInteger.valueOf(100));
        PorPediatria = Presupuesto.multiply(BigInteger.valueOf(30)).divide(BigInteger.valueOf(100));
        System.out.println("==============================================");
        System.out.println("El presupuesto para Ginecologia es de: " + PorGinecologia);
        System.out.println("El presupuesto para Traumatologia es de: " + PorTraumatologia);
        System.out.println("El presupuesto para Pediatria es de: " + PorPediatria);
        System.out.println("==============================================");
}

public void Ejercicio20() {
    double IntPagado, CapPrestado, TIntAnual, Años = 4;
            System.out.println("Ingrese el capital prestado:");
            CapPrestado = scanner.nextDouble();
            System.out.println("Ingrese el interes pagado");
            IntPagado = scanner.nextDouble();
        TIntAnual = (IntPagado / (CapPrestado * Años)) * 100;
        System.out.println("==============================================");
        System.out.println("El porcentaje de interes anual es: " + TIntAnual + "%");
        System.out.println("==============================================");
}

public void Ejercicio21() {
    int X = 48000, Y = 6, K = 42000;
        int CostoTotal;
        double GananciaNeta, PorGanancia;
        CostoTotal = (X / 12) * Y;
        GananciaNeta = K - CostoTotal;
        PorGanancia = (GananciaNeta / CostoTotal) * 100;
        System.out.println("==============================================");
        System.out.println("El porcentaje de ganancia es: " + PorGanancia + "%");
        System.out.println("==============================================");
}

public void Ejercicio22(){
    int PagoCont, T, PagPlazos, DifContados;
        double PorRecarga;
            System.out.println("Ingrese el monto del pago al contado:");
            PagoCont = scanner.nextInt();
            System.out.println("Ingrese el monto de pago a cuotas");
            T = scanner.nextInt();
        PagPlazos = T * 12;
        DifContados = PagPlazos - PagoCont;
        PorRecarga = ((double) DifContados / PagoCont) * 100;
        System.out.println("==============================================");
        System.out.println("El porcentaje de recarga es: " + PorRecarga + "%");
        System.out.println("==============================================");
}

public void Ejercicio23() {
    int M = 452, N = 197, B1 = 132, B2 = 180; 
        double B3 = 7.50, B4 = 14.50;
        double BulHarina, IngHarina, CajAceite, IngAceite, IngTotal, ResAceite, ResHarina;
        BulHarina = M / 24;
        ResHarina = M % 24;
        IngHarina = (BulHarina * B1) + (ResHarina * B3);
        CajAceite = N / 15;
        ResAceite = N % 15;
        IngAceite = (CajAceite * B2) + (ResAceite * B4);
        IngTotal = IngHarina + IngAceite;
        System.out.println("==================================================");
        System.out.println("El ingreso total por cada cada tonelada de maiz es: " + IngTotal);
        System.out.println("==================================================");
}
}