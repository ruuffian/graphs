package Edge;

import Node.Node;

public class WeightedEdge extends AEdge {

    public WeightedEdge(Node end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
