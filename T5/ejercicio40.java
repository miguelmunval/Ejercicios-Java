public class ejercicio40 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura del rombo: ");
        int altura = Integer.parseInt(System.console().readLine());
        int espaciosdentro = 0;
        int espaciosdelante = altura / 2;
        if ((altura < 3) || (altura % 2 == 0)) {
        System.out.print("Debe introducir una altura impar mayor o igual a 3");
        } else {
            int aux = 1;
            // parte de arriba /////////////////////////////////////
            while (aux <= altura / 2 + 1) {
                // inserta espacios delante
                for (int i = 1; i <= espaciosdelante; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int i = 1; i < espaciosdentro; i++) {
                    System.out.print(" ");
                }
                if (aux>1) {
                    System.out.print("*");
                }
                System.out.println();
                aux++;
                espaciosdelante--;
                espaciosdentro+=2;
            }
            espaciosdentro = altura - 3;
            espaciosdelante = 1;
            aux = 0;
            while (aux < altura / 2) {
            // inserta espacios delante
                for (int i = 1; i <= espaciosdelante; i++) {
                    System.out.print(" ");
                }
                // pinta la línea
                System.out.print("*");
                for (int i = 1; i < espaciosdentro; i++) {
                    System.out.print(" ");
                }
                if(aux < altura / 2 - 1) {
                    System.out.print("*");
                }
                System.out.println();
                aux++;
                espaciosdelante++;
                espaciosdentro -= 2;
            }
        }
    }
}
