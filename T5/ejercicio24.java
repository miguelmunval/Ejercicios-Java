public class ejercicio24 {
    public static void main(String[] args) {
        int altura;
        System.out.print("Introduzca la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());
        int asteriscos = 1;
        for (int i = altura-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < asteriscos; j++) {
                System.out.print(j);
            }
            for (int j = asteriscos; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
            asteriscos++;
        }
    }
}