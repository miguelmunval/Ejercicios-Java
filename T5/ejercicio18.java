public class ejercicio18 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        System.out.print("Introduzca el primer número: ");
        numero1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el segundo número: ");
        numero2 = Integer.parseInt(System.console().readLine());
        if (numero1 == numero2) {
            System.out.println("Por favor, introduzca 2 números distintos");
        } else {
            if (numero1 > numero2) {
                while (numero2 < numero1) {
                    if ((numero2 += 7) > numero1) {
                        
                    } else
                    System.out.println(numero2);
                }
            } else {
                while (numero1 < numero2) {
                    if ((numero1 += 7) > numero2) {
                        
                    } else
                    System.out.println(numero1);
                }
            }
        }
    }
}
