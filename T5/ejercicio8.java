public class ejercicio8 {
    public static void main(String[] args) {
        int numero;
        int resultado;
        System.out.print("Introduzca el número del que desea conocer la tabla: ");
        numero=Integer.parseInt(System.console().readLine());
        for (int i = 0; i < 11; i++) {
            resultado=numero*i;
            System.out.printf("%d * %d = %d\n", numero, i, resultado);
        }
    }
}
