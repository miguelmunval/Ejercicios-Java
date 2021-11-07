public class ejercicio35 {
    public static void main(String[] args) {
            System.out.print("Por favor, introduzca la altura de la X: ");
            int altura = Integer.parseInt(System.console().readLine());
            int aux = 1;
            int i = 0;
            int espaciosdentro = altura - 1;
            int espaciosdelante = 0;
            if ((altura < 3) || (altura % 2 == 0)) {
            System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
            } else {
            while (aux < altura / 2 + 1) {
                for (i = 1; i <= espaciosdelante; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (i = 1; i < espaciosdentro; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                aux++;
                espaciosdelante++;
                espaciosdentro -= 2;
            }
            espaciosdentro = 0;
            espaciosdelante = altura / 2;
            aux = 1;
            while (aux <= altura / 2 + 1) {
                for (i = 1; i <= espaciosdelante; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (i = 1; i < espaciosdentro; i++) {
                    System.out.print(" ");
                }
                if(aux>1) {
                    System.out.print("*");
                }
                System.out.println();
                aux++;
                espaciosdelante--;
                espaciosdentro+=2;
            }
        }
    }
}
