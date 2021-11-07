public class ejercicio49 {
    public static void main(String[] args) {
        System.out.println("Introduzca números. ");
        System.out.print("Para finalizar el programa, introduzca un número primo:");
        int numero;
        int suma = 0;
        int contar = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean primo;
        do {
            numero = Integer.parseInt(System.console().readLine());
            // comprueba si el número introducido es primo
            primo = true;
            for (int i = 2; i < numero; i++) {
                if ((numero % i) == 0) {
                    primo = false;
                }
            }
            // si no es primo, se contabiliza
            if (!primo) {
                suma += numero;
                contar++;
                max = numero > max ? numero : max;
                min = numero < min ? numero : min;
            }
        } while (!primo);
            System.out.println("Ha introducido "+ contar +" números.");
            System.out.println("Máximo: "+max);
            System.out.println("Mínimo: "+min);
            System.out.println("Media: "+(double)suma / contar);
    }
}
