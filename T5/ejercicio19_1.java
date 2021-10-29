public class ejercicio19_1 {
    public static void main(String[] args) {
        int altura;
        String caracter;
        System.out.print("Introduzca la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter con el que quiere que se forme: ");
        caracter = System.console().readLine();
        int asteriscos = 1;
        for (int i = altura-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print(caracter);
            }
            System.out.println();
            asteriscos = asteriscos + 2;
        }
    }
}
