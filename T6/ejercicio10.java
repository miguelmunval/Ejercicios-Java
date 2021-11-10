public class ejercicio10 {
    public static void main(String[] args) {
        /*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
        El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
        de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
        entre 1 y 40 caracteres.*/
        int caral;
        int longitud;
        for (int i = 0; i < 10; i++) {
            longitud=(int)((Math.random()*40)+1);
            for (int j = 0; j <= longitud; j++) {
                caral = (int)(Math.random()*6);
                switch (caral) {
                    case 0:
                        System.out.println("*");
                        break;
                    case 1:
                        System.out.println("-");
                        break;
                    case 2:
                        System.out.println("=");
                        break;
                    case 3:
                        System.out.println(".");
                        break;
                    case 4:
                        System.out.println("|");
                        break;
                    default:
                        System.out.println("@");
                        break;
                }
            }
        }
    }
}
