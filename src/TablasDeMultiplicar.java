import java.util.Scanner;

public class TablasDeMultiplicar {
    public int tablas(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el numero de la tabla que desea: ");
        numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+" * "+ i + " = " + (numero*i));
        }
        return 0;
    }
}
