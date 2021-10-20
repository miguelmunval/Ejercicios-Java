public class ejercicio18{
  public static void main(String[]args){
  int numero;
  int resultado;
  System.out.print("Introduzca un número entero de un máximo de 5 cifras: ");
  numero = Integer.parseInt(System.console().readLine());
  if (numero < 0){
    System.out.println("El número es negativo, porfavor introduzca un número positivo.");
    } else{
  if (numero < 10)
    {
    resultado = numero;
    System.out.println("El primer valor es: "+resultado);
    } else {
      if (numero<100)
      {
        resultado = numero/10;
        System.out.println("El primer valor es: "+resultado);
      }
      else
      {
        if (numero<1000)
        {
          resultado = numero/100;
          System.out.println("El primer valor es: "+resultado);
        }
        else
        {
          if (numero<10000){
            resultado = numero/1000;
            System.out.println("El primer valor es: "+resultado);
          } else {
            if (numero>=10000){
              resultado = numero/10000;
              System.out.println("El primer valor es: "+resultado);
              }else {
                System.out.println("El valor ingresado es superior a 5 dígitos");
              }
            }
          }
        }
      }
    }
  }
}
