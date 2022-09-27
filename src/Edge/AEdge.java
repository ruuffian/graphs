package Edge;


import Node.Node;

public abstract class AEdge implements IEdge {
    protected int weight = 1;
    protected Node start = null, end = null;

    public int cost() {
        return this.weight;
    }

    public Node traverse(Node begin) {
        return this.end.equals(begin) ? this.end : begin;
    }
}
