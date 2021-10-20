public class ejercicio23 {
  public static void main(String[] args) {
  System.out.print("Introduzca la base imponible: ");
  double baseimponible = Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
  String tipoIVA = System.console().readLine();
  System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
  String codigopromocional = System.console().readLine();
  int tipoIVAnum = 0;
  switch(tipoIVA) {
    case "general":
    tipoIVAnum = 21;
    break;
    case "reducido":
    tipoIVAnum = 10;
    break;
    case "superreducido":
    tipoIVAnum = 4;
    break;
    default:
    System.out.println("El tipo de IVA introducido no es correcto.");
  }
  double iva = baseimponible * tipoIVAnum / 100;
  double preciosindescuento = baseimponible + iva;
  double descuento = 0;
  switch(codigopromocional) {
    case "nopro":
    break;
    case "mitad": 
    descuento = preciosindescuento / 2;
    break;
    case "meno5": 
    descuento = 5;
    break;
    case "5porc": 
    descuento = preciosindescuento * 0.05;
    break;
    default:
    System.out.println("El código promocional introducido no es correcto.");
  }
  double total = preciosindescuento - descuento;
  System.out.printf("Base imponible %6.2f\n", baseimponible);
  System.out.printf("IVA (%2d%%) %6.2f\n", tipoIVAnum, iva);
  System.out.printf("Precio con IVA %6.2f\n", preciosindescuento);
  System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigopromocional, descuento);
  System.out.printf("TOTAL %6.2f", total);
  }
}
