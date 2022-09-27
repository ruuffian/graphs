package Node;

import Edge.*;

import java.util.ArrayList;
import java.util.List;

public class Node {
    List<AEdge> edges;
    int degree;

    public Node() {
        edges = new ArrayList<>();
    }

    boolean equals(Node comp) {
        return comp.hashCode() == this.hashCode();
    }

    void connectNode(Node end) {
        edges.add(new Edge(end));
        this.degree++;
    }

    void connectNode(Node end, int weight) {
        edges.add(new WeightedEdge(end, weight));
        this.degree++;

    }

    void connectNode(Node end, Node start) {
        edges.add(new DirectedEdge(end, start));
        this.degree++;

    }

    public List<AEdge> getEdges() {
        return edges;
    }
}
