/* This class represents a graph 
 * 
 * ©Michael Wilson */
import java.util.*;

public class MyGraph {
   /* The private fields of the graph */
   private List<Vertex> vertices;
   private List<Edge> edges;
   
   
   /* Initializes a graph
    *
    * @param V The set of vertices
    * @param E The set of edges */
   public MyGraph(List<Vertex> V, List<Edge> E) {
      vertices = V;
      edges = E;
      setNeighbors();
   }
   
   /* Returns the set of vertices */
   public List<Vertex> getVertices() {
      return vertices;
   }
   
   /* Returns the set of edges */   
   public List<Edge> getEdges() {
      return edges;
   }
   
   /* private method that sets up the neighbors for a vertex */
   private void setNeighbors() {
      for(Vertex v: vertices) {
         // create the neighbors list
         List<Vertex> neighbors = new ArrayList<>();
         for(Edge e: edges) {
            if(e.getSrc().getName().equals(v.getName())) 
               neighbors.add(e.getDest());           
         }
         v.setNeighbors(neighbors);  
      }
   }
}