public class ejercicio30 {
    public static void main(String[] args) {
        String dia1, dia2;
        int dia1n = 0, dia2n = 0;
        int hora1, hora2;
        System.out.print("Introduzca el primer día: ");
        dia1 = System.console().readLine();
        System.out.print("Introduzca la primera hora: ");
        hora1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el segundo día: ");
        dia2 = System.console().readLine();
        System.out.print("Introduzca la segunda hora: ");
        hora2 = Integer.parseInt(System.console().readLine());
        switch (dia1) {
            case "lunes":
            case "1":
                dia1 = "lunes";
                dia1n = 1;
                break;
            case "martes":
            case "2":
                dia1 = "martes";
                dia1n = 2;
                break;
            case "miercoles":
            case "3":
                dia1 = "miercoles";
                dia1n = 3;
                break;
            case "jueves":
            case "4":
                dia1 = "jueves";
                dia1n = 4;
                break;
            case "viernes":
            case "5":
                dia1 = "viernes";
                dia1n = 5;
                break;
            case "sabado":
            case "6":
                dia1 = "sabado";
                dia1n = 6;
                break;
            case "domingo":
            case "7":
                dia1 = "sabado";
                dia1n = 7;
                break;
            default:
                break;
        }
        switch (dia2) {
            case "lunes":
            case "1":
                dia2 = "lunes";
                dia2n = 1;
                break;
            case "martes":
            case "2":
                dia2 = "martes";
                dia2n = 2;
                break;
            case "miercoles":
            case "3":
                dia2 = "miercoles";
                dia2n = 3;
                break;
            case "jueves":
            case "4":
                dia2 = "jueves";
                dia2n = 4;
                break;
            case "viernes":
            case "5":
                dia2 = "viernes";
                dia2n = 5;
                break;
            case "sabado":
            case "6":
                dia2 = "sabado";
                dia2n = 6;
                break;
            case "domingo":
            case "7":
                dia2 = "sabado";
                dia2n = 7;
                break;
            default:
                break;
        }
        if (dia1n > dia2n) {
            System.out.println("No se puede medir el tiempo si el segundo dia es anterior al primero");
        }
        if ((dia1n == 0) || (dia2n == 0)) {
            System.out.println("No ha introducido un día válido, los días validos están entre lunes-domingo o 1-7");
        }
        if ((hora1 < 0) || (hora1 > 23) || (hora2 < 0) || (hora2 > 23)) {
            System.out.println("No ha introducido una hora correcta, por favor introduzca una hora comprendida entre 0 y 23.");
        }
        System.out.print("Entre las "+hora1+":00h del "+dia1);
        System.out.print(" y las "+hora2+":00h del "+dia2);
        System.out.println(" hay "+(((dia2n * 24)+hora2)-((dia1n * 24)+hora1))+" horas");
    }
}
