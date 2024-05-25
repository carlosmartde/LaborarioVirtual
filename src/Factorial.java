import java.util.Scanner;

public class Factorial {
    public int factorial(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int fact=1;
        for (int i=1; i<=numero; i++){
           fact*=i;
        }
        System.out.println("El factorial de "+numero+" es:"+fact);
        return 0;
    }
}
