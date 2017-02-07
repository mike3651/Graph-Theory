/* Class that represents a vertex for a graph
 * 
 * ©Michael Wilson */
public class Vertex {
   /* The identification of the vertex */
   String id;
   
   /* List of neighbors that the vertex has */
   List<Vertex> myNeighbors;
   
   /* Creates a general vertex
    * 
    * @param name The id of the vertex */
   public Vertex(String name) {
      this(name, null);
   }
   
   /* Creates a vertex with the neighbors 
    * 
    * @param ...
    * @param neighbors The adjacent vertices to this vertex */
   public Vertex(String name, List<Vertex> neighbors) {
      id = name;
      myNeighbors = neighbors;
   }
   
   /* Returns the name of this vertex */
   public String getName() {
      return id;
   }
   
   /* Returns the neighbors of this vertex */
   public List<Vertex> getNeighbors() {
      return myNeighbors;
   }
   
}