public class ejercicio50 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura del número: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el número de espacios entre los números: ");
        int espacios = Integer.parseInt(System.console().readLine());
        // Parte superior del 5 //////////////////////////
        // Fila 1
        for (int i = 1; i <= altura; i++) {
            System.out.print("*");
            for (int j = 0; j < espacios; j++) {
              System.out.print(" ");
            }
            if ((i==1)||(i==3)||(i==altura)){
              System.out.print("****");
            }else if (i==2){
              System.out.print("*   ");
            }else{
              System.out.print("   *");
            }
            for (int j = 0; j < espacios; j++) {
              System.out.print(" ");
            }
            if ((i==1)||(i==3)||(i==altura)){
              System.out.println("****");
            }else if (i==2){
              System.out.println("*   ");
            }else{
              System.out.println("   *");
            }
          }
    }
}
