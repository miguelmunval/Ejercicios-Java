public class ejercicio13 {
    public static void main(String[] args) {
        int numero;
        int positivo = 0;
        int negativo = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Introduzca un número: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero >= 0) {
                positivo = positivo + 1;
                negativo=10-positivo;
            }
        }
        System.out.println("Ha introducido: "+positivo+" números positivos");
        System.out.println("Ha introducido: "+negativo+"números negativos");
    }
}
