public class examen18_19_2 {
    public static void main(String[] args) {
        int altura;
        System.out.print("Introduzca la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());
        int asteriscos = 1;
        for (int i = 0; i < altura -1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = altura-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print(" ");
            }
            System.out.println();
            asteriscos = asteriscos + 2;
        }
    }
}
