public class ejercicio46 {
    public static void main(String[] args) {
        System.out.print("Introduzca la anchura del rectángulo: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        if ((anchura < 2) || (altura < 2)) {
            System.out.print("Los datos introducidos no son correctos, ");
            System.out.println(" el valor mínimo para la anchura y la altura es 2.");
        } else {
            // Línea superior ////////////////////////////////////////////////////////
            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
            // Parte intermedia //////////////////////////////////////////////////////
            for (int i = 2; i < altura; i ++) {
                System.out.print("\n*");
                for (int j = 2; j < anchura; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            // Línea inferior ////////////////////////////////////////////////////////
            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
        }
    }
}
