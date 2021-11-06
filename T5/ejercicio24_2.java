public class ejercicio24_2 {
    public static void main(String[] args) {
        System.out.println("Este programa pinta una pirámide hecha de números.");
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        int asteriscos = 1;
        int i = 0;
        int espacios = altura - 1;
        while (asteriscos <= altura) {
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (i = 1; i < asteriscos; i++) {
                System.out.print(i);
            }
            for (i = asteriscos; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            asteriscos++;
            espacios--;
        }
    }
}
