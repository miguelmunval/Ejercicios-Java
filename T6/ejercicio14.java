public class ejercicio14 {
    public static void main(String[] args) {
        /* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
        programa intentará adivinar el número que estás pensando - un número entre 0
        y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
        debe preguntar si el número que estás pensando es mayor o menor que el que
        te acaba de decir. */
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
            if (numero>xnumero) {
                xnumero=101;
            }
            if (adivina.equals("<")) {
                xnumero=numero;
                xnumero-=mnumero;
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
