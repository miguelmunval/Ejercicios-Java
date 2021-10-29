public class ejercicio6 {
    public static void main(String[] args) {
        int numero = 340;
        int i = 0;
        System.out.println("Este programa muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do-while.");
        do {
            numero-=20;
            i++;
            System.out.println("El número actual es: "+numero);
        } while (i < 9);
    }
}
