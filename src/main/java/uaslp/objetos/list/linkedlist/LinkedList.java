package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class LinkedList <T> implements List <T> {
    //private static final int UNA_CONSTANTE = 10;

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static int listsCount; //desde el principio hasta el finl del programa


    /*public LinkedList(){
        listsCount++;
    }
    public static int getListsCount(){
      return listsCount;
    }*/

    public void addAtTail(T data) throws NotNullValuesAllowedException{

        if(data == null){
            throw new NotNullValuesAllowedException();
        }
        Node<T> node = new Node<>(data);

        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }

        tail = node;
        size++;
    }

    public void addAtFront(T data) throws NotNullValuesAllowedException {
        if(data == null){
            throw new NotNullValuesAllowedException();
        }
        Node<T> node = new Node<>(data);

        if (size == 0) {
            tail = node;
        } else {
            head.previous = node;
        }
        node.next = head;
        head = node;

        size++;
    }

    public void remove(int index) throws NotValidIndexException {
        Node<T> node = findNode(index);
/*
        if(node == null){
            return;
        }
*/
        if(size == 1){
            head = null;
            tail = null;
        } else if(node == head){
            head = node.next;
            if(head != null){
                head.previous = null;
            }
        } else if(node == tail){
            tail = node.previous;
            if(tail != null){
                tail.next = null;
            }
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        size--;
    }

    public void removeAll() {
        head = null;
        tail = null;
        size = 0;
    }

    public void setAt(int index, T data) throws NotNullValuesAllowedException, NotValidIndexException {
        if(data == null){
            throw new NotNullValuesAllowedException();
        }
        Node<T> node = findNode(index);


            node.data = data;
        }

    /**
     * @param index 0-index
     * @return element at position index
     */
    //manejar la excepcion es hacer algo debido al recurso alternativo

    public T getAt(int index) throws NotValidIndexException {
        Node<T> node = findNode(index);

        return node == null ? null : node.data;
    }

    public Iterator<T> getIterator() {
        return new LinkedListiterator<>(head);
    }

    public int getSize() {
        return size;
    }

    private Node<T> findNode(int index) throws NotValidIndexException {

        if(index < 0 || index >= size){
            throw new NotValidIndexException(index);
        }

        Node<T> node = head;
        int currentIndex = 0;

        while (currentIndex != index) {
            currentIndex++;
            node = node.next;
        }

        return node;
    }
}