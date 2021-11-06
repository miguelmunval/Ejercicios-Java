public class ejercicio23 {
    public static void main(String[] args) {
        int numeros;
        int suma = 0;
        int i = 0;
        int media = 0;
        while (suma <= 10000) {
            System.out.print("Introduzca un numero, el programa parará cuando la suma de los números sea 10000: ");
            numeros = Integer.parseInt(System.console().readLine());
            suma += numeros;
            i++;
            media = suma/i;
        }
        System.out.println("El total acumulado es: "+suma);
        System.out.println("Ha introducido "+i+" numeros");
        System.out.println("La media de los numeros introducidos es "+media);
    }
}
