import java.util.Scanner;

public class SumaDePares {
    public int suma(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma=0;
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        for (int i=0; i<=numero; i+=2){
            suma+=i;
        }
        System.out.println("LA SUMA DE LOS NUMEROS PARES ENTRE 0 Y "+numero+" es :"+suma);

        return 0;
    }
}
