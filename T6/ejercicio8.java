public class ejercicio8 {
    public static void main(String[] args) {
        /*Modifica el programa anterior para que la probabilidad de que salga un 1 sea
        de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
        2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/
        int numero;
        String resultado="";
        for (int i = 0; i < 15; i++) {
            numero=(int)((Math.random()*7)-1);
            switch (numero) {
                case 0:
                    resultado="X";
                    break;
                case 1:
                    resultado="X";
                    break;
                case 6:
                    resultado="2";
                    break;
                default:
                    resultado="1";
                    break;
            }
            switch (i) {
                case 0:
                    System.out.print("1.Alavés - Levante: ");
                    System.out.println(resultado);
                    break;
                case 1:
                    System.out.print("2.Betis - Sevilla: ");
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.print("3.Celta - Barcelona: ");
                    System.out.println(resultado);
                    break;
                case 3:
                    System.out.print("4.Mallorca - Elche: ");
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.print("5.Espanyol - Granada: ");
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.print("6.Osasuna - Real Sociedad: ");
                    System.out.println(resultado);
                    break;
                case 6:
                    System.out.print("7.Real Madrid - Rayo Vallecano: ");
                    System.out.println(resultado);
                    break;
                case 7:
                    System.out.print("8.Villarreal - Getafe: ");
                    System.out.println(resultado);
                    break;
                case 8:
                    System.out.print("9.Almería - Burgos: ");
                    System.out.println(resultado);
                    break;
                case 9:
                    System.out.print("10.Cartagena - Málaga: ");
                    System.out.println(resultado);
                    break;
                case 10:
                    System.out.print("11.Fuenlabrada - Eibar: ");
                    System.out.println(resultado);
                    break;
                case 11:
                    System.out.print("12.Lugo - Ponferradina: ");
                    System.out.println(resultado);
                    break;
                case 12:
                    System.out.print("13.R. Oviedo - Las Palmas: ");
                    System.out.println(resultado);
                    break;
                case 13:
                    System.out.print("14.R. Zaragoza - Sporting: ");
                    System.out.println(resultado);
                    break;
                case 14:
                    System.out.print("P-15.Valencia - At. Madrid: ");
                    System.out.println(resultado);
                    break;
                default:
                    break;
            }
        }
    }
}
