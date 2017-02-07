/* This class represents a DAG
 * 
 * ©Michael Wilson */

public class Edge {
   /* The two vertices for the edge */
   private Vertex src, dest;
   
   /* The cost associated with the edge */
   private int cost;
   
   /* Constructs an edge between two vertices
    * 
    * @param src The source vertex
    * @param dest The destination vertex */
   public Edge(Vertex src, Vertex dest) {
      this(src, dest, 0);
   }
   
   /* Constructs a weighted edge 
    * 
    * @param ...
    * @param cost The cost of the edge */
   public Edge(Vertex src, Vertex dest, int cost) {
      this.src = src;
      this.dest = dest;
      this.cost = cost;
   }
   
   /* Returns the source */
   public Vertex getSrc() {
      return src;
   }
   
   /* Returns the destination */
   public Vertex getDest() {
      return dest;
   }
   
   /* Returns the cost of this edge */
   public int getCost() {
      return cost;
   }
}