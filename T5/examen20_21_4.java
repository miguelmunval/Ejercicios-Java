public class examen20_21_4 {
    public static void main(String[] args) {
        int num, estiramiento, digito;
        String numEstirado = "";    
        do {
          System.out.print("Intruduzca el número positivo a ser estirado: ");
          num = Integer.parseInt(System.console().readLine());
          if (num < 0) {
            System.out.println("Ha introducido un valor negativo. Se considerará como positivo.");
            num *= -1;
            }
            System.out.print("Intruduzca el estiramiento: ");
            estiramiento = Integer.parseInt(System.console().readLine());
            if (estiramiento <= 0) System.out.print("No acepto estiramientos negativos ni nulos. ");
    
        } while ((num == 0) || (estiramiento <= 0));
    
        for (int i = num; i > 0; i /= 10) {
          digito = i % 10;
          for (int j = 0; j < estiramiento; j++) numEstirado = digito + numEstirado;
        }
    
        System.out.println("El número "+num+" estirado por "+estiramiento+" es: "+numEstirado);
      }
}
