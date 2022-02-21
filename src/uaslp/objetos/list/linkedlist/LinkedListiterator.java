package uaslp.objetos.list.linkedlist;

public class LinkedListiterator {

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