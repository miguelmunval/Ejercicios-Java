public class ejercicio38 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura del reloj de arena: ");
        int altura = Integer.parseInt(System.console().readLine());
        int aux = 1;
        int asteriscos = altura;
        int espaciosdelante = 0;
        if ((altura < 3) || (altura % 2 == 0)) {
        System.out.print("Debe introducir una altura impar mayor o igual a 3.");
        } else {
            while (aux < altura / 2 + 1) {
                for (int i = 1; i <= espaciosdelante; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print("*");
                }
                System.out.println();
                aux++;
                espaciosdelante++;
                asteriscos -= 2;
            }
            espaciosdelante = altura / 2;
            aux = 1;
            while (aux <= altura / 2 + 1) {
                for (int i = 1; i <= espaciosdelante; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print("*");
                }
                System.out.println();
                aux++;
                espaciosdelante--;
                asteriscos += 2;
            }
        }
    }
}
