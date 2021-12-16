public class examen18_19_2a {
  public static void main(String[] args) {
    /* premios loteria */
    int [] premiados = new int [13];
    int reintegro;
    int boleto;
    int ganancias=0;
    for (int i = 0; i < 13; i++) {
      premiados[i]=(int)((Math.random()*9999)+1);
      for (int j = 0; j < i; j++) {
        if (premiados[i]==premiados[j]) {
          premiados[i]=(int)((Math.random()*9999)+1);
        }
      }
    }
    System.out.println(premiados[0]);
    reintegro=premiados[0]%10;
    System.out.println(reintegro);
    System.out.println("Introduzca sus numeros(1-9999):");
    do {
      boleto=Integer.parseInt(System.console().readLine());
      for (int i = 0; i < 13; i++) {
        if (boleto==premiados[i]) {
          switch (i) {
            case 0:
              System.out.println("Enhorabuena, su cupón está premiado con 1000€");
              if (ganancias<1000) {
                ganancias=1000;
              }
              break;
            case 1:
              System.out.println("Enhorabuena, su cupón está premiado con 500€");
              if (ganancias<500) {
                ganancias=500;
              }
            break;
            case 2:
              System.out.println("Enhorabuena, su cupón está premiado con 250€");
              if (ganancias<250) {
                ganancias=250;
              }
              break;
            default:
              System.out.println("Enhorabuena, su cupón está premiado con 50€");
              if (ganancias<50) {
                ganancias=50;
              }
              break;
          }
        } else {
          int ultimo=boleto%10;
          int primero;
          do {
            primero=boleto%10;
            boleto/=10;
          } while (boleto>0);
          if ((primero==reintegro)||(ultimo==reintegro)) {
            System.out.println("Enhorabuena, su cupón está premiado con 5€");
            if (ganancias<5) {
              ganancias=5;
            }
          }
        }
      }
    } while (boleto!=0);
  }
}
