public class ejercicio1 {
  public static void main (String[]args){
    System.out.print("Introduzca el día de la semana: ");
    String dia;
    dia = System.console().readLine();
    if (dia.equals("lunes")||dia.equals("Lunes")){
      System.out.println("LM");
      } else {
        if (dia.equals("martes")||dia.equals("Martes")){
          System.out.println("ED");
          } else {
            if (dia.equals("miercoles")||dia.equals("Miercoles")||dia.equals("miércoles")||dia.equals("Miércoles")){
              System.out.println("LM");
              } else {
                if (dia.equals("jueves")||dia.equals("Jueves")){
                  System.out.println("ED");
                  } else {
                    if (dia.equals("viernes")||dia.equals("Viernes")){
                      System.out.println("FOL");
                    } else {
                      System.out.println ("El día introducido no es válido, por favor introduzca un día válido");
                      }
                  }
                }
      }
    }
  }
}
