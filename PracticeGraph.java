//Graphs in Java (Adjacency List)

class Graph{
    int vertices; // number of vertices
    LinkedList<Integer> adjListArray[]; //an array of linkedLists 

    Graph( int V ) { /* constructor */
        this.vertices = V;
        adjListArray = new LinkedList[V];
        for(int i = 0; i < this.vertices; i++) {
            adjListArray[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        this.adjListArray[src].add(dest);
        this.adjListArray[dest].add(src);
    }
}

