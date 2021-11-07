public class ejercicio34_2 {
    public static void main(String[] args) {
        long numero1;
        long numero2;
        System.out.print("Introduzca el primer numero: ");
        numero1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca el segundo numero: ");
        numero2 = Long.parseLong(System.console().readLine());
        long aux = numero1;
        long aux2 = numero2;
        long reves = 0;
        long reves2 = 0;
        int digito = 1;
        int digitoim = 1;
        int x = 0;
        int y = 0;
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux /= 10;
            x++;
        }
        for (int i = 0; i < x; i++) {
            if (((reves%10)%2) == 0) {
                digito = (digito*10)+((int)reves);
            } else {
                digitoim = (digito*10)+((int)reves);
            }
            /*digito = ((int)reves%10);
            if ((digito%2) == 0) {
                digito*=10;
            } else {
                digitoim
            }*/
            reves/=10;
            System.out.println(digito+" "+digitoim);
        }
        while (aux2 > 0) {
            reves2 = (reves2 * 10) + (aux2 % 10);
            aux2/=10;
            y++;
        }
        for (int i = 0; i < y; i++) {
            if (((reves2%10)%2) == 0) {
                digito *=10+(int)reves;
            } else {
                digitoim *=10+(int)reves;
            }
            /*digito = ((int)reves%10);
            if ((digito%2) == 0) {
                digito*=10;
            }*/
            reves/=10;
        }
        System.out.print("El número de dígitos pares es: "+digito);
        System.out.println(" y el de digitos impares es: "+digitoim);
    }
}
