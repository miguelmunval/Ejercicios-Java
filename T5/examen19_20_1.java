public class examen19_20_1 {
        public static void main(String[] args) {
      
          String letra = "";
          int espacios = 0;
      
          System.out.println("Este programa dibuja un gusano en la pantalla");
          System.out.println("Controles: j=abajo-izquierda // k = abajo // l=abajo-derecha (seguido de Enter)");
          System.out.println("Para salir, pulse 's' ");
      
          do {
            for (int i = 1; i <= espacios; i++){
              System.out.print(" ");
            }
            System.out.print("*");
            for (int i = espacios; i < 20; i++){
              System.out.print(" ");
            }
            System.out.print("¿j,k,l,s?: ");
            letra = System.console().readLine();
            switch (letra) {
              case "j":
                if (espacios > 0){
                  espacios--;
                }
                break;
              case "l":
                if (espacios < 9){
                  espacios++;
                }
                break;
              default:
                break;
            }
          } while (!letra.equals("s"));
    }
}
