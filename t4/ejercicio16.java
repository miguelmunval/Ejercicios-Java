public class ejercicio16{
  public static void main(String[]args){
  int puntos = 0;
  String respuestas;
  System.out.println("Test de infidelidad");
  System.out.println("responda a las preguntas con (v) en caso de ser verdadero y con (f) en caso de que sea falso");
  System.out.print("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Ha aumentado sus gastos de vestuario?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Ha perdido el interés que mostraba anteriormente por ti?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿No te deja que mires la agenda de su teléfono móvil?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Has notado que últimamente se perfuma más?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
  System.out.print("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
  respuestas = System.console().readLine();
  if (respuestas.equals("v")){
    puntos+= 3;
    }
    if (puntos <= 10){
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      }
    if ((puntos > 11) && (puntos <= 22)){
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      }
    if ((puntos > 22) && (puntos <= 30)){
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      }
  }
}
