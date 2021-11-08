public class flechas {
    public static void main(String[] args) {
        int anchura;
        int altura;
        System.out.print("Introduzca la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la anchura de la piramide: ");
        anchura = Integer.parseInt(System.console().readLine());
        int asteriscos = 1;
        for (int i = 0; i < anchura ; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i==1)||(i == 0)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = anchura; i > 0; i--) {
            for (int j = 0; j < altura; j++) {
                if ((i==1)||(i == 0)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            asteriscos = asteriscos + 2;
        }
    }
}
