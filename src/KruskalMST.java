import java.util.*;

class KruskalMST {
    private Map<Character, Character> parent;
    private Map<Character, Integer> rank;

    public KruskalMST() {
        parent = new HashMap<>();
        rank = new HashMap<>();
    }

    public void makeSet(Character v) {
        parent.put(v, v);
        rank.put(v, 0);
    }

    public Character find(Character v) {
        if (parent.get(v) != v) {
            parent.put(v, find(parent.get(v)));
        }
        return parent.get(v);
    }

    public void union(Character v1, Character v2) {
        Character root1 = find(v1);
        Character root2 = find(v2);

        if (rank.get(root1) < rank.get(root2)) {
            parent.put(root1, root2);
        } else if (rank.get(root1) > rank.get(root2)) {
            parent.put(root2, root1);
        } else {
            parent.put(root2, root1);
            rank.put(root1, rank.get(root1) + 1);
        }
    }

    public int calculateMSTSum(List<Edge> edges) {
        int sum = 0;

        for (Edge edge : edges) {
            Character u = edge.getSource();
            Character v = edge.getDestination();

            if (find(u) != find(v)) {
                sum += edge.getWeight();
                union(u, v);
            }
        }

        return sum;
    }
}