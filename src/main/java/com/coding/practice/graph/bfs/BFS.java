package com.coding.practice.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();

            if (v.isVisited()) {
                continue;
            }

            v.setVisited(true);
            System.out.println(v.getData());

            for (Vertex vertex : v.getNeigbourVertex()) {
                queue.add(vertex);
            }
        }
    }
}
