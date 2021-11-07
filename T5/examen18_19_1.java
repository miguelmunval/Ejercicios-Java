public class examen18_19_1 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número del que desee conocer su valor binario: ");
        int numero = Integer.parseInt(System.console().readLine());
        int aux = numero;
        String binario="";
        while (aux > 0) {
            binario = (aux%2) + binario;
            aux /= 2;
        } 
        System.out.println(binario);
    }
}
