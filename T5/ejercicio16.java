public class ejercicio16 {
    public static void main(String[] args) {
        int numero;
        boolean primo = true;
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                primo = false;
            } 
        }
        if (primo == true) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo");
            
        }
    }
}
