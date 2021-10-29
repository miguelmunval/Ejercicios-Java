public class calculopotencia1 {
    public static void main(String[] args) {
        int base;
        int exponente;
        System.out.print("Base: ");
        base = Integer.parseInt(System.console().readLine());
        System.out.print("Exponente: ");
        exponente = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= exponente; i++) {
            int resultado = 1;
            for (int j = 1; j <= i; j++) {
                resultado = resultado * base;
            }
            System.out.printf("%d ^ %d = %d\n", base, i, resultado);
            base = base + 1; 
        }
    }
}