public class MyGraph {
   /* The private fields of the graph */
   Set<Vertex> vertices;
   Set<Edge> edges;
   
   
   /* Initializes a graph
    *
    * @param V The set of vertices
    * @param E The set of edges */
   public MyGraph(Set<Vertex> V, Set<Edge> E) {
      vertices = V;
      edges = E;
   }   
}