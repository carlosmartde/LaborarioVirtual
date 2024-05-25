public class SerieFibonacci {
    public static void generarSecuenciaFibonacci(int maximo) {
        int num1 = 0, num2 = 1;

        System.out.print("Secuencia de Fibonacci: " + num1);
        while (num2 <= maximo) {
            System.out.print(", " + num2);
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
        System.out.println();
    }
}
