public class S04Ejercicio24 {
public static void main(String[] args) {
System.out.println("1 - Programador junior");
System.out.println("2 - Prog. senior");
System.out.println("3 - Jefe de proyecto");
System.out.print("Introduzca el cargo del empleado (1 - 3): ");
int cargo = Integer.parseInt(System.console().readLine());
System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
int diasVisita = Integer.parseInt(System.console().readLine());
System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
int estadoCivil = Integer.parseInt(System.console().readLine());
double sueldoBase = 0;
switch(cargo) {
case 1: // Programador junior
sueldoBase = 950;
break;
case 2: // Programador senior
sueldoBase = 1200;
break;
case 3: // jefe de proyecto
sueldoBase = 1600;
break;
default:
System.out.println("No ha elegido correctamente el sueldo base.");
}
double sueldoDietas = diasVisita * 30;
double sueldoBruto = sueldoBase + sueldoDietas;
double irpf = 0;
if (estadoCivil == 1) { // Soltero
irpf = 25;
} else if (estadoCivil == 2) { // Casado
irpf = 20;
} else {
System.out.println("No ha elegido correctamente el estado civil.");
}
double cuantiaIrpf = (sueldoBruto * irpf) / 100;

