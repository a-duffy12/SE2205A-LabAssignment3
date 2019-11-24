import java.util.*; 

public class Graph {

    private HashMap<Node, LinkedList<Node>> adjacencyMap;
    public Graph() {
        adjacencyMap = new HashMap<>();
    }

    public void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjacencyMap.get(a);

        if (tmp != null) {
            tmp.remove(b);
        }
        else tmp = new LinkedList<>();
        tmp.add(b);
        adjacencyMap.put(a,tmp);
    }

    public void addEdge(Node source, Node destination) {

        if (!adjacencyMap.keySet().contains(source))
            adjacencyMap.put(source, null);

        if (!adjacencyMap.keySet().contains(destination))
            adjacencyMap.put(destination, null);

        addEdgeHelper(source, destination);
        addEdgeHelper(destination, source);
        
    }
    public boolean hasEdge(Node source, Node destination) {
        return adjacencyMap.containsKey(source) && adjacencyMap.get(source).contains(destination);
    }
    
    public void resetNodesVisited()
    {
    	 for (Node n : adjacencyMap.keySet()) {
             n.unvisit();
         }
    
    }
    
    void BFS(Node node) {

    	//implement the BFS code
    }
    
   
   public void DFS(Node node) {
     //Implement DFS
	   
   }
   
   public void printEdges() {
       //implement printEdges
	   
   }
}