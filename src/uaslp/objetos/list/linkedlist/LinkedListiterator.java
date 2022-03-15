package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListiterator implements Iterator {

    private Node currentNode;

    LinkedListiterator(Node startNode) {
        currentNode = startNode;
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public String next() {
        String data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }
}