public class ejercicio6 {
    public static void main(String[] args) {
        /*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
        adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
        el programa dirá cuántas oportunidades quedan y si el número introducido es
        menor o mayor que el número secreto.*/
        int numero;
        int aleatorio;
        int intentos = 5;
        aleatorio = (int)(Math.random()*101);
        do {
            System.out.print("Intente adivinar el número aleatorio generado(tendrá 5 intentos): ");
            numero=Integer.parseInt(System.console().readLine());
            if(numero!=aleatorio) {
                System.out.println("Ese no es el número, pruebe de nuevo, le quedan: "+intentos);
                intentos--;
            }
        } while (intentos>0&&numero!=aleatorio);
        if (numero==aleatorio) {
            System.out.println("Enorabuena, ha acertado el número");
        }
    }
}
