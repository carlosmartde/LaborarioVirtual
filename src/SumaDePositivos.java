import java.util.Scanner;

public class SumaDePositivos {
    public int sumaPositivos() {
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int suma=0;
        while (numero>=0){
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
            if (numero>=0) {
                suma += numero;
            }
        }numero=suma;
        System.out.println("La suma de los positivos es: "+suma);


        return 0;
    }
}
