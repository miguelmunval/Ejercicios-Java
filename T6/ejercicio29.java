public class ejercicio29 {
  public static void main(String[] args) {
    /* Realiza un programa que muestre la previsión del tiempo para mañana en
    Málaga. Las temperaturas máxima y mínima se deben generar de forma
    aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
    últimas décadas para cada estación. La probabilidad de que esté soleado
    o nublado en cada estación se proporciona a continuación. Obviamente, la
    temperatura mínima deberá ser menor o igual que la temperatura máxima. */
    int numero;
    int aleatorio;
    int aleatorio2;
    int probabilidad;
    String cielo="";
    System.out.print("1. Primavera \n2. Verano \n3. Otoño \n4. Invierno \nSeleccione la estación del año(1-4): ");
    numero=Integer.parseInt(System.console().readLine());
    switch (numero) {
      case 1:
        do {
        aleatorio=(int)((Math.random()*15)+15);
        aleatorio2=(int)((Math.random()*15)+15);
        probabilidad=(int)(Math.random()*10);
        } while (aleatorio==aleatorio2);
        switch (probabilidad) {
          case 6:
            cielo="Nublado";
            break;
          case 7:
            cielo="Nublado";
            break;
          case 8:
            cielo="Nublado";
            break;
          case 9:
            cielo="Nublado";
            break;
          default:
            cielo="Soleado";
            break;
        }
        if (aleatorio>aleatorio2) {
          System.out.println("Previsión del tiempo para mañana");
          System.out.println("--------------------------------");
          System.out.println("Temperatura mínima: "+aleatorio2+"ºC\nTemperatura máxima: "+aleatorio+"ºC");
          System.out.println(cielo);
        } else {
          System.out.println("Previsión del tiempo para mañana");
          System.out.println("--------------------------------");
          System.out.println("Temperatura mínima: "+aleatorio+"ºC\nTemperatura máxima: "+aleatorio2+"ºC");
          System.out.println(cielo);
        }
        break;
      case 2:
      do {
        aleatorio=(int)((Math.random()*20)+25);
        aleatorio2=(int)((Math.random()*20)+25);
        probabilidad=(int)(Math.random()*10);
        } while (aleatorio==aleatorio2);
        switch (probabilidad) {
          case 8:
            cielo="Nublado";
            break;
          case 9:
            cielo="Nublado";
            break;
          default:
            cielo="Soleado";
            break;
        }
        if (aleatorio>aleatorio2) {
          System.out.println("Previsión del tiempo para mañana");
          System.out.println("--------------------------------");
          System.out.println("Temperatura mínima: "+aleatorio2+"ºC\nTemperatura máxima: "+aleatorio+"ºC");
          System.out.println(cielo);
        } else {
          System.out.println("Previsión del tiempo para mañana");
          System.out.println("--------------------------------");
          System.out.println("Temperatura mínima: "+aleatorio+"ºC\nTemperatura máxima: "+aleatorio2+"ºC");
          System.out.println(cielo);
        }
        break;
      case 3:
        do {
          aleatorio=(int)((Math.random()*10)+20);
          aleatorio2=(int)((Math.random()*10)+20);
          probabilidad=(int)(Math.random()*10);
          } while (aleatorio==aleatorio2);
          switch (probabilidad) {
            case 6:
              cielo="Soleado";
              break;
            case 7:
              cielo="Soleado";
              break;
            case 8:
              cielo="Soleado";
              break;
            case 9:
              cielo="Soleado";
              break;
            default:
              cielo="Nublado";
              break;
          }
          if (aleatorio>aleatorio2) {
            System.out.println("Previsión del tiempo para mañana");
            System.out.println("--------------------------------");
            System.out.println("Temperatura mínima: "+aleatorio2+"ºC\nTemperatura máxima: "+aleatorio+"ºC");
            System.out.println(cielo);
          } else {
            System.out.println("Previsión del tiempo para mañana");
            System.out.println("--------------------------------");
            System.out.println("Temperatura mínima: "+aleatorio+"ºC\nTemperatura máxima: "+aleatorio2+"ºC");
            System.out.println(cielo);
          }
        break;
      case 4:
        do {
          aleatorio=(int)((Math.random()*-25)+25);
          aleatorio2=(int)((Math.random()*-25)+25);
          probabilidad=(int)(Math.random()*10);
          } while (aleatorio==aleatorio2);
          switch (probabilidad) {
            case 8:
              cielo="Soleado";
              break;
            case 9:
              cielo="Soleado";
              break;
            default:
              cielo="Nublado";
              break;
          }
          if (aleatorio>aleatorio2) {
            System.out.println("Previsión del tiempo para mañana");
            System.out.println("--------------------------------");
            System.out.println("Temperatura mínima: "+aleatorio2+"ºC\nTemperatura máxima: "+aleatorio+"ºC");
            System.out.println(cielo);
          } else {
            System.out.println("Previsión del tiempo para mañana");
            System.out.println("--------------------------------");
            System.out.println("Temperatura mínima: "+aleatorio+"ºC\nTemperatura máxima: "+aleatorio2+"ºC");
            System.out.println(cielo);
          }
        break;
      default:
        break;
    }
  }
}