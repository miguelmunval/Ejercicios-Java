public class ejercicio37 {
    public static void main (String[] args) {
        long numero;
        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = Integer.parseInt(System.console().readLine());
        } while (numero < 1);
            System.out.print(numero + " = ");
            int aux = (int)numero;
            int x = 0;
            int reves = 0;
            while (aux > 0){
                reves = ((reves*10) + (aux % 10));
                aux /=10;
                x++;
            }
            int digito = 0;
            for (int i = 0; i < x; i++){
                digito = reves%10;
                reves /= 10;
            for (int j = 0; j < digito; j++){
                System.out.print("|");
            }
            if (i < x-1){
                System.out.print("-");
            }
            }
    }
}
