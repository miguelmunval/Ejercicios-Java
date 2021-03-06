import java.util.Scanner;

public class examen_20_21_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articulo;
        double precio;
        int cantidad;
        int tipoIVA;
        boolean error;
        double total = 0;
        double baseImponible4 = 0;
        double baseImponible10 = 0;
        double baseImponible21 = 0;
        double aux;
    
        do {      
          System.out.print("Introduzca nombre del artículo ('fin' para salir): ");
          articulo = scanner.nextLine();
      
          if (!articulo.equals("fin")) {
            System.out.printf("Precio por unidad para %s (IVA incluido): ", articulo);
            precio = scanner.nextDouble();
        
            System.out.printf("Cantidad de unidades de %s: ", articulo);
            cantidad = scanner.nextInt();
        
            aux = precio * cantidad;
    
            total += aux;
            
            do {
              error = false;
    
              System.out.printf("Tipo de IVA aplicado a %s (4,10,21): ", articulo);
              tipoIVA = scanner.nextInt();
      
              switch (tipoIVA) {
                case 4:
                  baseImponible4 += aux / 1.04;
                  break;
                case 10:
                  baseImponible10 += aux / 1.1;
                  break;
                case 21:
                  baseImponible21 += aux / 1.21;
                  break;
                default:
                  System.out.println("El tipo de IVA introducido no es válido.");
                  error = true;
                  break;
              }
            } while (error);
    
            scanner.nextLine();
          }
    
        } while (!articulo.equals("fin"));
    
        scanner.close();
    
        System.out.printf("TOTAL:%37.2f\n", total);
        for (int i = 0; i < 43; i++) System.out.print("-");
        System.out.println();
    
        System.out.printf("Base imponible  4%%:%11.2f IVA:%8.2f\n", baseImponible4, baseImponible4 * 0.04);
        System.out.printf("Base imponible 10%%:%11.2f IVA:%8.2f\n", baseImponible10, baseImponible10 * 0.1);
        System.out.printf("Base imponible 21%%:%11.2f IVA:%8.2f\n", baseImponible21, baseImponible21 * 0.21);
    
      }
}
