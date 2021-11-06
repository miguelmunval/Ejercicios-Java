public class ejercicio28 {
    public static void main(String[] args) {
        int numero;
        int resultado = 1;
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.println("El resultado es de: "+resultado);
    }
}
