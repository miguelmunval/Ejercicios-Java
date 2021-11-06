public class ejercicio27 {
    public static void main(String[] args) {
        int numero;
        int multiplo;
        int suma = 0;
        int contador = 0;
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= numero; i++) {
            multiplo = i * 3;
            System.out.println("Los multiplos de 3 son"+multiplo);
            suma += multiplo;
            contador++;
        }
        System.out.println("La suma de los múltiplos es: "+suma);
        System.out.println("Y son un total de: "+contador);
    }
}
