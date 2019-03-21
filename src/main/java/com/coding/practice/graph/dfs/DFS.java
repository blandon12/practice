package com.coding.practice.graph.dfs;

import java.util.List;
import java.util.Stack;

public class DFS {

    private static Stack<Vertex> stack;

    public static void dfs(List<Vertex> list) {

        for (Vertex vertex : list) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsWithStack(vertex);
            }
        }
    }

    private static void dfsRecursion(Vertex vertex) {

        System.out.println(vertex);
        for (Vertex v : vertex.getNeighbourVertex()) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsRecursion(v);
            }
        }
    }

    private static void dfsWithStack(Vertex root) {

        stack.push(root);

        while (!stack.empty()) {
            Vertex vertex = stack.pop();
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                System.out.println(vertex.getData());

                for (Vertex v : vertex.getNeighbourVertex()) {
                    if (!v.isVisited()) {
                        stack.push(v);
                    }
                }
            }
        }
    }
}
