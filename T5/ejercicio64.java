public class ejercicio64 {
    public static void main(String[] args) {
        int anchura = 6;
        int altura = 3;
        int aux;
        int numeroMenu = 0;
        while (numeroMenu != 4){
          for (int i = 1; i <= altura; i++) {
            if ((i == 1)||(i == altura)){
              for (int j = 1; j <= anchura; j++) {
              System.out.print("*");
              }
              System.err.println();
            }else {
                System.out.print("*");
                for (int j = 1; j <= (anchura - 2); j++) {
                    System.out.print(".");
                }
                System.out.println("*");
            }
          }//For altura
          System.out.println("1. Agrandarlo");
          System.out.println("2. Achicarlo");
          System.out.println("3. Cambiar la orientacion");
          System.out.println("4. Salir");
          System.out.print("Indique que quiere hacer con el resultado: ");
          numeroMenu = Integer.parseInt(System.console().readLine());
    
          switch (numeroMenu) {
    
            case 1:
              anchura++;
              altura++;
              break;
    
            case 2:
              anchura--;
              altura--;
              break;
    
            case 3:
              aux = anchura;
              anchura = altura;
              altura = aux;
              break;
    
            case 4:
              break;
              
            default:
              System.out.println("Opcion no valida");
              break;
    
          }//Switch
    
          System.out.println();
    
        }//While
    }
}
