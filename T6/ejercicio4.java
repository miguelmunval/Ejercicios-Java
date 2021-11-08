public class ejercicio4 {
    public static void main(String[] args) {
        /*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
        por espacios.*/
        for (int i = 1; i <= 20; i++) {
            System.out.print((int)(Math.random()*11)+" ");
        }
    }
}
