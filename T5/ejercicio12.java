public class ejercicio12 {
    public static void main(String[] args) {
        int n;
        int numero1 = 0;
        int numero2 = 1;
        int resultado;
        System.out.print("Introduzca el número de términos de Fibonacci que quiere: ");
        n = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < n; i++) {
            resultado = numero1 + numero2;
            System.out.print(numero1+" "+numero2+" "+resultado+" | ");
            numero1 = numero2;
            numero2 = resultado;
            
        }
    }
}
