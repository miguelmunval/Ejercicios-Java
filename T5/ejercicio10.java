public class ejercicio10 {
    public static void main(String[] args) {
        float notas;
        int resultado;
        System.out.print("Introduce el numero de notas a las que le quiere hacer la media: ");
        int media = Integer.parseInt(System.console().readLine());
        for (int i = 1; i < media; i++){
            System.out.print("Introduzca un número: ");
            notas = Float.parseFloat(System.console().readLine());
            resultado = (int)notas/media;
            System.out.println(""+resultado);
        }
    }
}