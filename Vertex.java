/* Class that represents a vertex for a graph
 * 
 * ©Michael Wilson */
import java.util.*; 
 
public class Vertex {
   /* The identification of the vertex */
   private String id;
   
   /* List of neighbors that the vertex has */
   private List<Vertex> myNeighbors;
   
   /* The visited state of the vertex */
   private boolean visited;
   
   /* Creates a general vertex
    * 
    * @param name The id of the vertex */
   public Vertex(String name) {
      this(name, null, false);
   }
   
   /* Creates a vertex with the neighbors 
    * 
    * @param ...
    * @param neighbors The adjacent vertices to this vertex 
    * @param visited The current visitation state of the vertex */
   public Vertex(String name, List<Vertex> neighbors, boolean visited) {
      id = name;
      myNeighbors = neighbors;
      this.visited = visited;
   }
   
   /* Returns the name of this vertex */
   public String getName() {
      return id;
   }
   
   /* Returns the neighbors of this vertex */
   public List<Vertex> getNeighbors() {
      return myNeighbors;
   }
   
   /* Method that sets up the list of neighbors */
   public void setNeighbors(List<Vertex> neighbors) {
      myNeighbors = neighbors;
   }
   
   /* Gets the visitation state of the vertex */
   public boolean isVisited() {
      return visited;
   }
   
   /* Toggles the visitation state of the node */
   public void toggleVisit() {
      visited = !visited;
   }
}