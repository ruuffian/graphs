package Edge;

import Node.Node;

public class DirectedEdge extends AEdge {

    public DirectedEdge(Node end, Node start) {
        this.start = start;
        this.end = end;
        this.weight = 1;
    }
}
