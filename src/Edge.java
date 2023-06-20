import java.util.*;

class Edge {
    private Character source;
    private Character destination;
    private int weight;

    public Edge(Character source, Character destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    public Character getSource() {
        return source;
    }

    public Character getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}