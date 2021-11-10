public class ejercicio9 {
    public static void main(String[] args) {
        /*Realiza un programa que vaya generando números aleatorios pares entre 0
        y 100 y que no termine de generar números hasta que no saque el 24. El
        programa deberá decir al final cuántos números se han generado.*/
        int numero;
        int x=0;
        do {
            numero=(int)(((Math.random()*101)*2));
            x++;
        } while (numero!=24);
        System.out.println("Se han generado: "+x+" numeros");
    }
}
