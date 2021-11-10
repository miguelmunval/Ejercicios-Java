public class ejercicio14 {
    public static void main(String[] args) {
        int numero;
        String adivina="";
        int intentos=5;
        int xnumero=101;
        int mnumero=0;
        do {
            numero=(int)((Math.random()*xnumero)+mnumero);
            System.out.println(numero);
            System.out.print("¿Ha acertado?(si es si introduzca = si no diga si su numero es > o <) ");
            adivina=System.console().readLine();
            if (adivina.equals("<")) {
                xnumero=numero;
                xnumero-=mnumero+1;
            }
            if (adivina.equals(">")) {
                mnumero=numero+1;
                xnumero-=mnumero+1;
            }
            intentos--;
        } while ((!adivina.equals("="))&&(intentos>0));
        if ("=".equals(adivina)) {
            System.out.println("Bien, he conseguido acertar el número :)");
        } else {
            System.out.println("Una pena, no me ha sido posible adivinarlo :(");
        }
    }
}
