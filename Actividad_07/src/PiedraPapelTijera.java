import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner (System.in);
      Random random = new Random();

      int PJugador = 0;
      int PIA = 0;
      
      String[] opciones = {"P", "L", "T"};
     
      System.out.println("Bienvenido Jugador");
      System.out.println("Estas en el juego de de Piedra, Papel o Tijeras");
      System.out.println("Introduce la letra P para sacar Piedra");
      System.out.println("Introduce la letra L para sacar Papel");
      System.out.println("Introduce la letra T para sacar Tijeras");
      System.out.println("Introduce la letra S cuando te hayas aburrido y quieras ver el resultado");   
          
      do{
            String jugadaPJ = scanner.nextLine().toUpperCase();
  
            String jugadaIA = opciones[random.nextInt(opciones.length)];
  
            if (jugadaIA.equals("P")) {

               System.out.println("La IA eligio Piedra");
               System.out.println();
            }

            if (jugadaIA.equals("L")) { 

               System.out.println("La IA eligio Papel");
               System.out.println();
            }

            if (jugadaIA.equals("T")) {

               System.out.println("La IA eligio Tijeras");
               System.out.println();
            }
                                      
            if (jugadaPJ.equals(jugadaIA)) {

               System.out.println("Empate");
               System.out.println();
               System.out.println("Introduce - P - para Piedra");
               System.out.println("Introduce - L - para Papel");
               System.out.println("Introduce - T - para Tijeras");
               System.out.println("Introduce - S - para Salir");
            } 
              
            else if ((jugadaPJ.equals("T") && jugadaIA.equals("L")) ||
                     (jugadaPJ.equals("L") && jugadaIA.equals("P")) ||
                     (jugadaPJ.equals("P") && jugadaIA.equals("T"))) {

               System.out.println("Ganaste");
               System.out.println();
               System.out.println("Introduce - P - para Piedra");
               System.out.println("Introduce - L - para Papel");
               System.out.println("Introduce - T - para Tijeras");
               System.out.println("Introduce - S - para Salir");
               PJugador ++;
            } 

            else {

               System.out.println("Perdiste");
               System.out.println();
               System.out.println("Introduce - P - para Piedra");
               System.out.println("Introduce - L - para Papel");
               System.out.println("Introduce - T - para Tijeras");
               System.out.println("Introduce - S - para Salir");
               PIA ++;
            }
  
            if (jugadaPJ.equals("S")) {

               if (PJugador > PIA) {

                     System.out.println("Tu puntuacion fue: " + PJugador); 
                     System.out.println("La puntuacion de la IA fue: " + PIA); 
                     System.out.println();
                     System.out.println("Ganaste");
     
                  } 
                  
                  else if (PIA == PJugador) {
                        
                     System.out.println("Tu puntuacion fue: " + PJugador); 
                     System.out.println("La puntuacion de la IA fue: " + PIA); 
                     System.out.println();
                     System.out.println("Quedasteis en empate");
                  } 
                  
                  else {

                     System.out.println("Tu puntuacion fue: " + PJugador); 
                     System.out.println("Y la puntuacion de la IA fue: " + PIA); 
                     System.out.println();
                     System.out.println("Perdiste la partida");
                      
                  }
                
               }
      
         } 
         
         while(true);
    
      }
      
  }