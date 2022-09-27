package Edge;

import Node.Node;

public interface IEdge {
    /**
     * Returns the weight of an edge.
     * @return The cost or weight of traversing an edge.
     */
    int cost();

    /**
     * The other node on the end of the edge
     * @return The other end of the edge.
     */
    Node traverse(Node begin);
}
