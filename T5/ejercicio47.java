public class ejercicio47 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int aux = (altura - 3) / 2;
        if ((altura % 2 != 0) && (altura >= 5)) {
            System.out.println("MMMMMM");
            for (int i = 0; i < aux; i++) {
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
            for (int i = 0; i < aux; i++) {
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        } else {
            System.out.println("La altura introducida no es correcta.");
        }
    }
}
