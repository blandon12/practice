package com.coding.practice.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;

    private boolean visited;

    private List<Vertex> neighbourVertex;

    public Vertex(String data) {
        this.data = data;
        this.neighbourVertex = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighbourVertex() {
        return neighbourVertex;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeigbourVertex(Vertex vertex) {
        this.neighbourVertex.add(vertex);
    }

    @Override
    public String toString() {
        return data;
    }
}
