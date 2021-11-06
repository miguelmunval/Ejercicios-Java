public class ejercicio26 {
    public static void main(String[] args) {
        int numero;
        int digito;
        int aux = 1;
        System.out.print("Introduzca un número: ");
        numero=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un dígito incluido en el número anterior : ");
        digito=Integer.parseInt(System.console().readLine());
        int delreves = 0;
        while (numero > 0) {
            delreves = (delreves * 10) + (numero % 10);
            numero/=10;
        }
        while (delreves > 0) {
            if ((delreves % 10) == (digito)) {
                System.out.println(aux+" ");
            }
            delreves/=10;
            aux++;
        }
    }
}
