import java.util.Scanner;

public class PositivoNegativo {
    public Float numero () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ");
        Float numero = entrada.nextFloat();
        if (numero ==0){
            System.out.println(numero + " es igual a cero");
        }else if (numero >0){
            System.out.println(numero + " Es un numero positivo");
        }else if (numero<0){
            System.out.println(numero + " Es un numero negativo");
        }
        return numero;
    }
}
