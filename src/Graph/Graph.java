package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Graph {
    private int V;
    private LinkedList<Integer>[] graph;

    public Graph(int v) {
        V = v;
        graph = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new LinkedList<>();
        }
    }

    void addEdge(int firstVertex, int secondVertex) {
        graph[firstVertex].add(secondVertex);
    }

    List<Integer> dfsIterative(int v) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()) {
            v = stack.pop();
            if (!visited[v]) {
                result.add(v);
                visited[v] = true;
            }
            LinkedList<Integer> neighbors = graph[v];
            for (int i = 0; i < neighbors.size(); i++) {
                v = neighbors.get(i);
                if (!visited[v]) {
                    stack.push(v);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph(5);
        graph1.addEdge(0, 1);
        graph1.addEdge(1, 0);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 0);
        graph1.addEdge(2, 1);
        graph1.addEdge(2, 4);
        graph1.addEdge(3, 0);
        graph1.addEdge(4, 2);
        graph1.addEdge(0, 3);
        graph1.addEdge(0, 2);

        System.out.println(graph1.dfsIterative(0));
    }
}
