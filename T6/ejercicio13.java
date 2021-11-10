public class ejercicio13 {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        do {
            dado1=(int)(Math.random()*7);
            dado2=(int)(Math.random()*7);
            System.out.print(dado1+" "+dado2+", ");
        } while (dado1 != dado2);
    }
}
