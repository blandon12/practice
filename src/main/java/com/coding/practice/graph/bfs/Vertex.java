package com.coding.practice.graph.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;

    private boolean visited;

    private List<Vertex> neigbourVertex;

    public Vertex(String data) {
        this.data = data;
        this.neigbourVertex = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeigbourVertex() {
        return neigbourVertex;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeigbourVertex(Vertex vertex) {
        this.neigbourVertex.add(vertex);
    }

    @Override
    public String toString() {
        return data;
    }
}
