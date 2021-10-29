public class ejercicio9 {
    public static void main(String[] args) {
        int numero;
        int i = 0;
        System.out.println("Este programa le dirá el número de cifras que tiene el número introducido.");
        System.out.print("Introduzca un número: ");
        numero=Integer.parseInt(System.console().readLine());
        while (numero/10 > 0) {
            numero/=10;
            i++;
        }
        System.out.println("El número introducido tiene: "+(i+1)+" cifras.");
    }
}
