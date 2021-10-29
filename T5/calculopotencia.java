public class calculopotencia {
    public static void main(String[] args) {
        int base;
        int exponente;
        int resultado = 1;
        System.out.print("Base: ");
        base = Integer.parseInt(System.console().readLine());
        System.out.print("Exponente: ");
        exponente = Integer.parseInt(System.console().readLine());
        for (int i = 1; i < exponente; i++) {
            resultado *= base;
            System.out.printf("%d ^ %d = %d\n", base, i, resultado);
        }
    }
}