public class ejercicio31 {
    public static void main(String[] args) {
        int altura;
        System.out.print("Introduzca la altura de la L: ");
        altura = Integer.parseInt(System.console().readLine());
        for (int i = 1; i < altura; i++) {
            System.out.println("*");
            if (i == altura-1) {
                for (int j = 0; j < ((altura+ 1)/2); j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
