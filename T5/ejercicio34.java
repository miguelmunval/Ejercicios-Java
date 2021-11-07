public class ejercicio34 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número: ");
        long numero1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro número: ");
        long numero2 = Long.parseLong(System.console().readLine());
        long aux = numero1;
        int digito;
        long reves = 0;
        int x = 0;
        long reves2 = 0;
        long pares = 0;
        long impares = 0;
        if (aux == 0) {
        x = 1;
        }
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux /= 10;
            x++;
        } 
            aux = numero2;
            while (aux > 0) {
                reves2 = (reves2 * 10) + (aux % 10);
                aux /= 10;
            }       
            for (int i = 0; i < x; i++) {
                digito = (int)(reves % 10);
                if ((digito % 2) == 0) {
                    pares = pares * 10 + digito;
                } else {
                    impares = impares * 10 + digito;
                }
                digito = (int)(reves2 % 10);
                if ((digito % 2) == 0) {
                    pares = pares * 10 + digito;
                } else {
                    impares = impares * 10 + digito;
            }
            reves /= 10;
            reves2 /= 10;
            }
        System.out.println("El número formado por los dígitos pares es: " + pares);
        System.out.println("El número formado por los dígitos impares es: " + impares);
    }
}
