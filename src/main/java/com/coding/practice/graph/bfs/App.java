package com.coding.practice.graph.bfs;

public class App {

    public static void main(String[] args) {

        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");

//        vertex1.addNeigbourVertex(vertex2);
        vertex1.addNeigbourVertex(vertex3);
//        vertex1.addNeigbourVertex(vertex4);
        vertex3.addNeigbourVertex(vertex5);
        vertex4.addNeigbourVertex(vertex3);
        vertex5.addNeigbourVertex(vertex4);
        vertex5.addNeigbourVertex(vertex2);

        BFS.bfs(vertex1);
    }
}
