public class NumerPar {
    public int numeropar(){
        int numero;
        System.out.println("INGRESE UN NUMERO");
        numero = Integer.parseInt(System.console().readLine());
        if (numero % 2 == 0) {
            System.out.println(numero+" SI ES UN NUMERO PAR");
        }else {
            System.out.println(numero+" ES UN NUMERO IMPAR");
        }
        return 0;
    }
}
