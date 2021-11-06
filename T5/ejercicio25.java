public class ejercicio25 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Este programa muestra por pantalla un número introducido por teclado pero dado la vuelta.");
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        int aux = numero;
        int delreves = 0;
        while (aux > 0) {
            delreves = (delreves * 10) + (aux % 10);
            aux/=10;
        }
        System.out.println("Al darle la vuelta al número "+numero+" obtenemos el número "+delreves);
    }
}
