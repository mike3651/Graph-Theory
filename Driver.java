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
   
   /* Keeps track of the graph */
   static MyGraph graph;

   public static void main(final String[] theArgs) {
      myVertices = new ArrayList<Vertex>();
      myEdges = new ArrayList<Edge>();
      createVertices();
      createEdges();
      graph = new MyGraph(myVertices, myEdges);
   }   
   
   /* Method that creates a bunch of vertices */
   private static void createVertices() {
      String name = "";
      for(int i = 0; i < VERTEX_COUNT; i++) {
          name = "V:" + (i + 1);          
          myVertices.add(new Vertex(name));
      }
      printVertices();
   }
          
   /* Prints the current vertices */
   private static void printVertices() {
      for(Vertex v : myVertices) 
         System.out.print(v.getName() + " ");
      System.out.println();
   }        
   
   /* Method that generates random edges */
   private static void createEdges() {
      // used for selecting a random vertex
      Random rand = new Random();
      for(int i = 0; i < 10; i++) {
         Vertex src = myVertices.get(rand.nextInt(myVertices.size()));
         Vertex dest = myVertices.get(rand.nextInt(myVertices.size()));
         if(isValid(src, dest)) {
            Edge newEdge = new Edge(src, dest);
            if(isValidEdge(newEdge))
               myEdges.add(newEdge);
         }
      }
      printEdges();
   }
   
   /* Checks for the validity of an edge */
   private static boolean isValid(Vertex src, Vertex dest) {
      // prevent self directing
      if(src.getName().equals(dest.getName())) return false;
      else return true;
   }
   
   /* Checks to see if the edge already exists */
   private static boolean isValidEdge(Edge validate) {
      for(Edge e: myEdges) 
         if(e.getSrc().getName().equals(validate.getSrc().getName())
            && e.getDest().getName().equals(validate.getDest().getName()))
            return false;
      return true;
   }
   
   /* Method that prints the edges */
   private static void printEdges() {
      for(Edge e : myEdges) 
         System.out.println("Src: " + e.getSrc().getName()
                          + " Dest: " + e.getDest().getName());
   }
}