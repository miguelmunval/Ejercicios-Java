public class ejercicio11 {
    public static void main(String[] args) {
        int numero;
        int cuadrado;
        int cubo;
        System.out.print("Introduzca el primer número del que desea hacer el cuadrado y el cubo: ");
        numero = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < 5; i++) {
            cuadrado = numero * numero;
            cubo = numero * numero * numero;
            System.out.println("Base = "+numero+"\t"+"|"+"\t"+"cuadrado = "+cuadrado+"\t"+"|"+"\t"+"cubo = "+cubo);
            numero++;
        }
    }
}
