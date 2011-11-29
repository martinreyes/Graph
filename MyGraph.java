// Martin Reyes
// 12/1/11
// derp


import java.util.*;

/**
 * A representation of a graph.
 * Assumes that we do not have negative cost edges in the graph.
 */
public class MyGraph implements Graph {
	private Collection<Vertex> myVertices;	// the vertices in this graph
	private Collection<Edge> myEdges;	// the edges in this graph

	/**
	 * Creates a MyGraph object with the given collection of vertices
	 * and the given collection of edges.
	 * @param v a collection of the vertices in this graph
	 * @param e a collection of the edges in this graph
	 */
	public MyGraph(Collection<Vertex> v, Collection<Edge> e) {
		//Make array the length of # of vertices in collection of vertices
		//then iterate over collection of edges, finding where the "from" is in
		//array then make array point to linked list containing "to" vertex.
		
		
	}


    /** 
     * Return the collection of vertices of this graph
     * @return the vertices as a collection (which is anything iterable)
     */
    public Collection<Vertex> vertices() {
		return myVertices;
		// iterate over array containing vertices
		// return as collection
		// .keyset bitch
    }

    /** 
     * Return the collection of edges of this graph
     * @return the edges as a collection (which is anything iterable)
     */
    public Collection<Edge> edges() {
		return myEdges;
		//look in each "bucket" (array) and make "from" be the current index 
		//and "to" be any of the linked lists in that index. Add to collection
		//and return.

    }

    /**
     * Return a collection of vertices adjacent to a given vertex v.
     *   i.e., the set of all vertices w where edges v -> w exist in the graph.
     * Return an empty collection if there are no adjacent vertices.
     * @param v one of the vertices in the graph
     * @return an iterable collection of vertices adjacent to v in the graph
     * @throws IllegalArgumentException if v does not exist.
     */
    public Collection<Vertex> adjacentVertices(Vertex v) {
		return myVertices;
		//find vertex v in array, then iterate over all linked lists
		//and return all the vertices present

    }

    /**
     * Test whether vertex b is adjacent to vertex a (i.e. a -> b) in a directed graph.
     * Assumes that we do not have negative cost edges in the graph.
     * @param a one vertex
     * @param b another vertex
     * @return cost of edge if there is a directed edge from a to b in the graph, 
     * return -1 otherwise.
     * @throws IllegalArgumentException if a or b do not exist.
     */
    public int isAdjacent(Vertex a, Vertex b) {
		return 0;
		//find bucket named with vertex, then find if vertex b
		//exists as linked list object. return cost (field within node).

    }

    /**
     * Returns the shortest path from a to b in the graph.  Assumes positive
     * edge weights.  Uses Dijkstra's algorithm.
     * @param a the starting vertex
     * @param b the destination vertex
     * @param path a list in which the path will be stored, in order, the first
     * being the start vertex and the last being the destination vertex.  The
     * list will be empty if no such path exists.  NOTE: the list will be
     * cleared of any previous data.  path is not expected to contain any data
     * needed by the method when the method is called.  It is used to allow
     * us to return multiple values from the function.
     * @return the length of the shortest path from a to b, -1 if no such path
     * exists.
     * @throws IllegalArgumentException if a or b does not exist.
     */
    public int shortestPath(Vertex a, Vertex b, List<Vertex> path) {
		int c = 99;
    	return 0;

	// YOUR CODE HERE

    }

}
