public class ejercicio32 {
    public static void main(String[] args) {
        long numero;
        System.out.print("Introduzca un número: ");
        numero = Long.parseLong(System.console().readLine());
        long aux = numero;
        long reves = 0;
        int digito;
        int suma = 0;
        int x = 0;
        if (aux == 0) {
            x = 1;
        }
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux/=10;
            x++;
        }
        System.out.print("Los dígitos pares son: ");
        for (int i = 0; i < x; i++) {
            digito = ((int)reves%10);
            if ((digito%2) == 0) {
                System.out.print(digito+" ");
                suma+=digito;
            }
            reves/=10;
        }
        System.out.println("La suma de todos los pares es de: "+suma);
    }
}
