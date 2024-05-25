import java.util.Scanner;

public class NumerosHastaN {
    public int numero(){
        int numero;
        int i=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        numero = entrada.nextInt();
        while (i<=numero){
            System.out.println(i);
            i++;
        }
        return 0;
    }
}
