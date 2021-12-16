public class ejercicio15 {
  public static void main(String[] args) {
    /* Un restaurante nos ha encargado una aplicación para colocar a los clientes en
    sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
    (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
    el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
    un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
    “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
    como máximo e intente de nuevo”. Para el grupo que llega, se busca
    siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
    busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
    dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
    las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
    nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
    pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
    programa se ilustra a continuación: */
    int [] sitios = new int [9];
    int x=0;
    boolean sentar;
    for (int i = 0; i < 9; i++) {
      sitios[i]=(int)(Math.random()*5);
    }
    do {
      System.out.print("Mesa nº  ");
      for (int i = 0; i < 9; i++) System.out.printf("%5d", (i+1));
      System.out.println();
      System.out.print("Ocupación");
      for (int i = 0; i < 9; i++) System.out.printf("%5d", sitios[i]);
      System.out.println();
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      x=Integer.parseInt(System.console().readLine());
      int i = 0;
      if (x>0) {
      if (x<5) {
        do {
          sentar = false;
          if (sitios[i] + x <= 4){
            sentar = true;
            sitios[i] += x;
          }else if (!sentar) i++;
        } while(!sentar && i < 9);
        if (sentar == false) System.out.println("Lo siento no tenemos mesa");
        else System.out.println("Por favor sientese en la mesa " + (i + 1));
      } else {
        System.out.println("Haga grupos de 4 personas como máximo e intente de nuevo");
        }
      } else {
        System.out.println("Gracias. Hasta pronto.");
      }
    } while (x!=-1);
  }
}
