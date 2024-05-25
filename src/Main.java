import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("**************MENU**************");
            System.out.println("[1] NUMERO POSITIVO O NEGATIVO");
            System.out.println("[2] NUMERO PAR O IMPAR");
            System.out.println("[3] NUMERO MAYOR");
            System.out.println("[4] AÑO BISIESTO");
            System.out.println("[5] NUMEROS DEL 1 AL 20 CON WHILE");
            System.out.println("[6] NUMEROS DEL 1 HASTA 'N'");
            System.out.println("[7] SUMA DE POSITIVOS");
            System.out.println("[8] SERIE FIBONACCIO HASTA 'N'");
            System.out.println("[9] NUMEROS PARES CON FOR");
            System.out.println("[10] TABLAS DE MULTIPLICAR");
            System.out.println("[11] SUMA DE NUMEROS PARES HASTA 'N'");
            System.out.println("[12] CALCULAR FACTORIAL");
            System.out.println("[0] SALIR DEL PROGRAMA");
            System.out.println("SELECCIONA UNA OPCION:");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1: {
                    PositivoNegativo pos = new PositivoNegativo();
                    pos.numero();
                }
                break;
                case 2: {
                    NumerPar num = new NumerPar();
                    num.numeropar();

                }
                break;
                case 3: {
                    NumeroMayor num = new NumeroMayor();
                    num.numeroMayor();

                }
                break;
                case 4: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Ingresa un año: ");
                    int año = scanner.nextInt();

                    if (AñoBisiesto.esBisiesto(año)) {
                        System.out.println(año + " es un año bisiesto.");
                    } else {
                        System.out.println(año + " no es un año bisiesto.");
                    }
                }
                break;
                case 5: {
                    NumerosAscendente num = new NumerosAscendente();
                    num.numero();
                }
                break;
                case 6: {
                    NumerosHastaN num = new NumerosHastaN();
                    num.numero();
                }
                break;
                case 7: {
                    SumaDePositivos num = new SumaDePositivos();
                    num.sumaPositivos();
                }
                break;
                case 8: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Ingresa un número máximo para la secuencia de Fibonacci: ");
                    int maximo = scanner.nextInt();
                    SerieFibonacci serie = new SerieFibonacci();
                    serie.generarSecuenciaFibonacci(maximo);
                }
                break;
                case 9: {
                NumerosParesFor num = new NumerosParesFor();
                num.par();
                }
                break;
                case 10: {
                    TablasDeMultiplicar tablasDeMultiplicar= new TablasDeMultiplicar();
                    tablasDeMultiplicar.tablas();
                }
                break;
                case 11: {
                    SumaDePares sumaDePares = new SumaDePares();
                    sumaDePares.suma();
                }
                break;
                case 12: {
                    Factorial factorial = new Factorial();
                    factorial.factorial();
                }
                break;
                case 0:{
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                    return;
                }
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 0);


    }
}