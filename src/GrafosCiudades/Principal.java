package GrafosCiudades;

import java.util.*;

public class Principal {

    String initial = null;
    Graph graph = new Graph();
    String current;
    Scanner input = new Scanner(System.in);

    String ciudades[] = {
        "Coruña",
        "Vigo",
        "Valladolid",
        "Bilbao",
        "Oviedo",
        "Madrid",
        "Zaragoza",
        "Gerona",
        "Barcelona",
        "Valencia",
        "Murcia",
        "Abalcete",
        "Granada",
        "Jaén",
        "Badajoz",
        "Sevilla",
        "Cádiz"
    };

    /*
    el constructor se iniciara en el momento que inicie la clase. este llenara el grafo con la informacion de las ciudades.
    */
    public Principal() {
        graph.addVertex(ciudades[0], ciudades[1], 171);
        graph.addVertex(ciudades[0], ciudades[2], 455);
        graph.addVertex(ciudades[1], ciudades[2], 356);
        graph.addVertex(ciudades[2], ciudades[3], 280);
        graph.addVertex(ciudades[2], ciudades[5], 193);
        graph.addVertex(ciudades[3], ciudades[4], 304);
        graph.addVertex(ciudades[3], ciudades[6], 324);
        graph.addVertex(ciudades[3], ciudades[5], 395);
        graph.addVertex(ciudades[5], ciudades[6], 325);
        graph.addVertex(ciudades[5], ciudades[13], 335);
        graph.addVertex(ciudades[5], ciudades[14], 403);
        graph.addVertex(ciudades[5], ciudades[11], 251);
        graph.addVertex(ciudades[6], ciudades[8], 296);
        graph.addVertex(ciudades[7], ciudades[8], 100);
        graph.addVertex(ciudades[8], ciudades[9], 349);
        graph.addVertex(ciudades[9], ciudades[10], 241);
        graph.addVertex(ciudades[9], ciudades[11], 191);
        graph.addVertex(ciudades[10], ciudades[12], 278);
        graph.addVertex(ciudades[12], ciudades[13], 99);
        graph.addVertex(ciudades[13], ciudades[15], 242);
        graph.addVertex(ciudades[15], ciudades[12], 256);
        graph.addVertex(ciudades[15], ciudades[16], 125);
    }

    //imprime las uniones de ciudades y su distancia
    public void imprimirContenido() {
        System.out.println("\tContenido del grafo");
        System.out.println(ciudades[0] + " - " + ciudades[1] + " - " + 171);
        System.out.println(ciudades[0] + " - " + ciudades[2] + " - " + 455);
        System.out.println(ciudades[1] + " - " + ciudades[2] + " - " + 356);
        System.out.println(ciudades[2] + " - " + ciudades[3] + " - " + 280);
        System.out.println(ciudades[2] + " - " + ciudades[5] + " - " + 193);
        System.out.println(ciudades[3] + " - " + ciudades[4] + " - " + 304);
        System.out.println(ciudades[3] + " - " + ciudades[6] + " - " + 324);
        System.out.println(ciudades[3] + " - " + ciudades[5] + " - " + 395);
        System.out.println(ciudades[5] + " - " + ciudades[6] + " - " + 325);
        System.out.println(ciudades[5] + " - " + ciudades[13] + " - " + 335);
        System.out.println(ciudades[5] + " - " + ciudades[14] + " - " + 403);
        System.out.println(ciudades[5] + " - " + ciudades[11] + " - " + 251);
        System.out.println(ciudades[6] + " - " + ciudades[8] + " - " + 296);
        System.out.println(ciudades[7] + " - " + ciudades[8] + " - " + 100);
        System.out.println(ciudades[8] + " - " + ciudades[9] + " - " + 349);
        System.out.println(ciudades[9] + " - " + ciudades[10] + " - " + 241);
        System.out.println(ciudades[9] + " - " + ciudades[11] + " - " + 191);
        System.out.println(ciudades[10] + " - " + ciudades[12] + " - " + 278);
        System.out.println(ciudades[12] + " - " + ciudades[13] + " - " + 99);
        System.out.println(ciudades[13] + " - " + ciudades[15] + " - " + 242);
        System.out.println(ciudades[15] + " - " + ciudades[12] + " - " + 256);
        System.out.println(ciudades[15] + " - " + ciudades[16] + " - " + 125);
    }
    
    //metodo de busqueda dijstrak
    public void busqueda(){
        System.out.print("Introduce la ciudad de donde vas a partir: ");
        String ciudad1 = this.input.next();
        System.out.println("");
        System.out.print("Introduce la ciudad a donde quieres llegar: ");
        String ciudad2 = this.input.next();
        graph.dijkstra(ciudad1, ciudad2);
    }
    
    public static void main(String[] args) {
        int h = 0;
        Principal obj = new Principal();
        while(h != 99){
            System.out.print(""
                    + "\tmi ultimo programa bien cabron.... literal... jodanse\n"
                    + "1.- Imprimir contenido\n"
                    + "2.- Buscar ruta\n"
                    + "3.- Salir\n"
                    + ">");
            h= obj.input.nextInt();
            switch (h){
                case 1:
                    obj.imprimirContenido();
                    break;
                case 2:
                    obj.busqueda();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}