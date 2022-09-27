package Graph;

import Node.Node;

import java.util.LinkedList;
import java.util.List;

public interface IGraph {
    int dfs(Node start, Node target);

    Node bfs(Node start, Node target);

    List<Node> adj();

    Node[][] matr();

    LinkedList<Node> djikstra(Node start, Node end);
}
