public class ejercicio11 {
    public static void main(String[] args) {
        int notas;
        String nota="";
        int suspenso = 0;
        int suficiente=0;
        int bien=0;
        int notable=0;
        int sobresaliente=0;
        for (int i = 0; i < 20; i++) {
            notas = (int)(Math.random()*5);
            switch (notas) {
                case 0:
                    nota="suspenso";
                    break;
                case 1:
                    nota="suficiente";
                    break;
                case 2:
                    nota="bien";
                    break;
                case 3:
                    nota="notable";
                    break;
                default:
                    nota="sobresaliente";
                    break;
            }
            System.out.print(nota+" ");
            switch (nota) {
                case "suspenso":
                    suspenso++;
                    break;
                case "suficiente":
                    suficiente++;
                    break;
                case "bien":
                    bien++;
                    break;
                case "notable":
                    notable++;
                    break;
                case "sobresaliente":
                    sobresaliente++;
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        System.out.printf("Hay un total de %d suspensos, %d aprobados con suficiente, %d bienes, %d notables, %d sobresalientes", suspenso, suficiente, bien, notable, sobresaliente);
    }
}
