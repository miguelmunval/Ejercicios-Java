public class Ejercicio3_2 {
    public static void main(String[] args) {
        /**
         * ] Implemente un programa que genere el "desglose del IVA" para una serie de
         * productos adquiridos en una tienda. El programa ha de solicitar, de manera
         * reiterada, los siguientes datos para cada producto que se adquiera:
         * 
         * nombre artículo cantidad precio por unidad (IVA incluido) tipo de IVA (a
         * elegir entre 4%, 10%, 21%)
         * 
         * El programa finalizará de pedir datos cuando se le ponga como nombre del
         * artículo el valor "fin". En ese momento, debe realizar un desglose indicando
         * el precio total de la compra y las bases imponibles correspondientes a cada
         * tramo de IVA, así como la cuantía del IVA por cada tramo. Observe cómo el
         * programa ha de solicitar los datos al usuario ("recuerda" el nombre del
         * artículo sobre el que le está pidiendo información; se señala en el ejemplo
         * en colorines1 ). Vea el siguiente ejemplo:
         * 
         */
        String articulo = "";
        double precio = 0;
        double cantidad = 0;
        int IVA = 0;
        double total = 0;
        double base4 = 0;
        double base10 = 0;
        double base21 = 0;
        System.out.println("FACTURA TIENDA");
        System.out.println("--------------");
        while (!articulo.equals("fin")) {
            System.out.print("Introduzca el nombre del articulo: ");
            articulo = System.console().readLine();
            if (articulo.equals("fin")) {
                System.out.println("----------------");
            } else {
                System.out.print("Introduzca el precio del articulo " + articulo + ": ");
                precio = Double.parseDouble(System.console().readLine());
                System.out.print("Introduzca la cantidad: ");
                cantidad = Integer.parseInt(System.console().readLine());
                System.out.print("Introduzca el tipo de IVA aplicado (4, 10, 21): ");
                IVA = Integer.parseInt(System.console().readLine());
                total += precio * cantidad;
                if (IVA == 4) {
                    base4 += precio * cantidad;
                } else if (IVA == 10) {
                    base10 += precio * cantidad;
                } else if (IVA == 21) {
                    base21 += precio * cantidad;
                } else {
                    System.out.print("El iva introducido es incorrecto.Prueba otra vez:\n");
                }
            }
        }
        System.out.printf("\nTOTAL:                                   %1s\n", total);
        System.out.println("--------------------------------------------------------");
        System.out.println("Base Imponible 4%:             " + (base4 - (base4 * 0.4)) + "             IVA:      " + base4 * 0.4);
        System.out.println("Base Imponible 10%:             " + (base10 - (base10 * 0.10)) + "         IVA:      "
                + base10 * 0.10);
        System.out.println("Base Imponible 21%:             " + (base21 - (base21 * 0.21)) + "         IVA:      "
                + base21 * 0.21);
    }
}
