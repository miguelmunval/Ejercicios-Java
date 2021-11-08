public class ejercicio1 {
    public static void main(String[] args) {
        /*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
        también la suma total (los puntos que suman entre los tres dados).*/
        System.out.println("3 dados y suma de los 3 valores:");
        int suma = 0;
        int numero;
        for (int i = 1; i <= 3; i++) {
            numero = (int)(Math.random()*6+1);
            suma += numero;
            System.out.printf("El resultado del dado %d es de: %d\n", i, numero);
        }
        System.out.printf("La suma de los 3 resultados es de: %d", suma);
    }
}
