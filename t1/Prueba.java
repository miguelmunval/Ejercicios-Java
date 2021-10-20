public class Prueba {
        public static void main (String[] args){
        //esto es un comentario de una sola linea
        /*esto es un comentario
         * que ocupa varias lineas*/
              int nota1, nota2, nota3;
              float notadecimal = 6.7325f;
              
              System.out.println("Hola");
              System.out.println("Introduzca un valor entero");
              nota1 = Integer.parseInt(System.console().readLine());
              /*
              System.out.print("El numero introducido es: ");
              System.out.println(nota1);
              */
              System.out.println("El numero introducido es: "+nota1);
              System.out.printf("El numero %-10d es el que has introducido.\n",nota1);
              System.out.printf("El numero %10.2f es el que has introducido.\n",notadecimal);
        }
}
