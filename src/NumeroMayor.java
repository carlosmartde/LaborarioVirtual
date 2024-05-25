public class NumeroMayor{
    public float numeroMayor() {
        float a, b,c;
        System.out.println("Ingrese el primer numero: ");
        a = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el segundo numero: ");
        b = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el tercer numero: ");
        c = Float.parseFloat(System.console().readLine());
        if (a > b && a > c) {
            System.out.println(a + " Es el numero mayor");
        } else if (b > a && b > c){
            System.out.println(b + " Es el numero mayor");
        }else{
            System.out.println(c + " Es el numero mayor");
        }
        return 0;
    }
}
