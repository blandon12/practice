package com.coding.practice.linked_lists.insert_node_position;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertNodeAtPositionApp {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        // Optimal solution
        SinglyLinkedListNode tmp = head;
        SinglyLinkedListNode aux = new SinglyLinkedListNode(data);

        if (position == 0) {
            aux.next = tmp;
            return aux;
        }

        for (int i = 0; i < position; i++) {
            if (i == position - 1) {
                aux.next = tmp.next;
                tmp.next = aux;
            }
            tmp = tmp.next;
        }

        return head;


//        LinkedList<Integer> list = new LinkedList<>();
//
//        if (position == 0) {
//            list.add(data);
//        }
//
//        int i = 1;
//        list.add(head.data);
//        SinglyLinkedListNode node = head.next;
//        while (node.next != null) {
//
//            if (i == position) {
//                list.add(data);
//            }
//
//            list.add(node.data);
//            node = node.next;
//
//            i++;
//        }
//
//        if (i == position) {
//            list.add(data);
//        }
//        list.add(node.data);
//
//        SinglyLinkedList sList = new SinglyLinkedList();
//        for (int d : list) {
//            sList.insertNode(d);
//        }
//
//        return sList.head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
