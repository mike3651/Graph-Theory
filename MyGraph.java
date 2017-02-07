/* This class represents a graph 
 * 
 * ©Michael Wilson */
import java.util.*;

public class MyGraph {
   /* The private fields of the graph */
   private Set<Vertex> vertices;
   private Set<Edge> edges;
   
   
   /* Initializes a graph
    *
    * @param V The set of vertices
    * @param E The set of edges */
   public MyGraph(Set<Vertex> V, Set<Edge> E) {
      vertices = V;
      edges = E;
   }
   
   /* Returns the set of vertices */
   public Set<Vertex> getVertices() {
      return vertices;
   }
   
   /* Returns the set of edges */   
   public Set<Edge> getEdges() {
      return edges;
   }
}