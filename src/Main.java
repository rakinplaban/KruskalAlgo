import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge('A', 'B', 3));
        edges.add(new Edge('B', 'C', 5));
        edges.add(new Edge('C', 'D', 4));
        edges.add(new Edge('D', 'E', 2));
        edges.add(new Edge('E', 'F', 5));
        edges.add(new Edge('E', 'A', 4));
        edges.add(new Edge('D', 'F', 8));
        edges.add(new Edge('C', 'F', 6));
        edges.add(new Edge('B', 'F', 8));
        edges.add(new Edge('A', 'F', 7));

        KruskalMST mst = new KruskalMST();

        // Populate the set for each node
        for (Edge edge : edges) {
            mst.makeSet(edge.getSource());
            mst.makeSet(edge.getDestination());
        }

        int mstSum = mst.calculateMSTSum(edges);
        System.out.println("Sum of edges in the Minimum Spanning Tree: " + mstSum);
    }
}