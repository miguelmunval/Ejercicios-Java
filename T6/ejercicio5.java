public class ejercicio5 {
    public static void main(String[] args) {
        /*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
        separados por espacios. Muestra también el máximo, el mínimo y la media
        de esos números.*/
        int suma=0;
        int media = 0;
        int numero;
        int max=0;
        int min=200;
        for (int i = 1; i <= 50; i++) {
            numero = (int)(Math.random()*200);
            System.out.print(numero+" ");
            if (numero>max) {
                max=numero;
            }
            if (numero<min) {
                min=numero;
            }
            suma += numero;
            media= suma/i;
        }
        System.out.println();
        System.out.printf("La media de los números mostrados es: %d, el número maximo mostrado es: %d y el min es: %d", media, max, min);
    }
}
