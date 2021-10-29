public class ejercicio3 {
    public static void main(String[] args) {
        int contador = -5;
        int i = -1;
        do {
            contador += 5;
            i++;
            System.out.println("El resultado de "+i+" multiplicado por 5 es de: "+contador);
        } while (i < 20);
    }
}
