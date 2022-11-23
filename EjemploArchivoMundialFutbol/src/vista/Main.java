package vista;

import entidades.SeleccionFutbol;
import java.io.IOException;
import java.util.ArrayList;
import modelo.GestionSeleccionFutbol;

/**
 *
 * @author Jairo F
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SeleccionFutbol argentina = new SeleccionFutbol(1, "Argentina", 24, true, 0.7, "Conmebol");
        SeleccionFutbol francia = new SeleccionFutbol(2, "Franciaa", 22, true, 0.8, "Uefa");
        SeleccionFutbol mexico = new SeleccionFutbol(3, "Mexico", 26, true, 0.5, "Concacaf");
        SeleccionFutbol colombia = new SeleccionFutbol(4, "Colombia", 22, false, 0.5, "Conmebol");
        SeleccionFutbol ecuador = new SeleccionFutbol(45, "Ecuador", 22, true, 0.56, "Conmebol");

        GestionSeleccionFutbol modelo = new GestionSeleccionFutbol();

        try {
//            // escritura de archivo
            modelo.registrarSeleccion(argentina);
            modelo.registrarSeleccion(francia);
            modelo.registrarSeleccion(mexico);
            modelo.registrarSeleccion(colombia);
            modelo.registrarSeleccion(ecuador);

              //lectura de archivo
              ArrayList<SeleccionFutbol> lista = modelo.leerSelecciones();
              for(SeleccionFutbol s: lista){
                  System.out.println(s);
              }
              System.out.println("----------------------------------");
              System.out.println("Busqueda");
              //busqueda
              SeleccionFutbol buscada = modelo.buscarSeleccionPorId(4);
              System.out.println("");
              
              System.out.println(buscada);
              System.out.println("----------------------------------");
              System.out.println("Clasificada");
              ArrayList<SeleccionFutbol> clasificadas= modelo.buscarClasificada(true);
              for (SeleccionFutbol cl : clasificadas) {
                  System.out.println(cl);
              }
        } catch (IOException ioe) {
            System.out.println("Excepcion: " + ioe.getMessage());
        }

    }

}
