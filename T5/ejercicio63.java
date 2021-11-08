public class ejercicio63 {
        public static void main(String[] args) {
          int altura1;
          int altura2;
          int hmax;
          int asteriscos1 = 1;
          int asteriscos2 = 1;
          int espaciosdelante;
          int espaciosmedio;
          System.out.print("Introduce la altura de la primera pirámide: ");
          altura1 = Integer.parseInt(System.console().readLine());
      
          System.out.print("Introduce la altura de la segunda piramide: ");
          altura2 = Integer.parseInt(System.console().readLine());
          espaciosmedio = altura1*2;
          if (altura1 >= altura2){
            hmax = altura1;
            espaciosmedio++;
          }else{
            hmax = altura2;
          }
          espaciosdelante = hmax - 1;
          for (int i = 0; i < hmax; i++) {
            for (int j = 1; j <= espaciosdelante; j++){
              System.out.print(" ");
            } //For espacios delanteros
            if (i >= (altura2 - altura1)||(altura1 > altura2)){
              for (int j = 1; j <= asteriscos1; j++){
                System.out.print("*");
              } //For primera piramide
              asteriscos1 += 2;
            }//If primera piramide
            if (i == (altura2 - altura1)&&(altura2 > altura1)){
              espaciosmedio--;
            }else if(i > (altura2 - altura1)||(altura1 > altura2)){
              espaciosmedio -= 2;
            }
            for (int j = 1; j <= espaciosmedio; j++){
              System.out.print(" ");
            } //For espacios medio
            if (i >= (altura1 - altura2)){
              for (int j = 1; j <= asteriscos2; j++){
                System.out.print("*");
              } //For segunda piramide
              asteriscos2 += 2;
            }
            System.out.println();
            espaciosdelante--;
        }//For altura
    }
}
