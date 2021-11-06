public class ejercicio21 {
    public static void main(String[] args) {
        int numeros = 0;
        int par = 0;
        int contador = 0;
        int i = 0;
        int j = 0;
        int media = 0;
        while (numeros >= 0) {
            System.out.print("Introduzca un número, para finalizar el programa introduzca un numero negativo: ");
            numeros = Integer.parseInt(System.console().readLine());
            if (((numeros % 2) == 0) && (numeros > par) && (numeros>0)) {
                par = numeros;
            } 
            if (((numeros % 2) != 0) && (numeros>0)) {
                contador += numeros;
                i++;
                media = contador/i;
            }
            if (numeros>0) {
                j++;
            }
        }
        System.out.println("La media de los números impares introducidos es: "+media+" y el par más alto es: "+par+" y se han introducido un total de: "+j+" números");
    }
}
