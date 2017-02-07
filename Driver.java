/* Kicks off the whole program
 * 
 * ©Michael Wilson */
import java.util.*; 
 
public class Driver {
   /* Number of vertices in the graph */
   public final static int VERTEX_COUNT = 5;

   /* List of vertices */
   static List<Vertex> myVertices;
   
   /* List of Edges */
   static List<Edge> myEdges;

   public static void main(final String[] theArgs) {
      myVertices = new ArrayList<Vertex>();
      myEdges = new ArrayList<Edge>();
      createVertices();
   }   
   
   /* Method that creates a bunch of vertices */
   private static void createVertices() {
      String name = "";
      for(int i = 0; i < VERTEX_COUNT; i++) {
          name = "Vertex: " + (i + 1);          
          myVertices.add(new Vertex(name));
      }
   }
          
}