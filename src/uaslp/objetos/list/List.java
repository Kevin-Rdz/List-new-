package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.LinkedListiterator;

//todos los metodos deben ser publicos
//A la interfaz solo le interesa como funcionan los metodos
//A la interfaz no le importa el cuerpo
//Bajo acoplamiento -> una clase puede ser modificada sin afecar a otra
public interface List {
    void addAtTail(String data);
    void addAtFront ( String data );
    void remove ( int index );
    void removeAll();
    void setAt(int index, String data);
    String getAt(int index);
    Iterator getIterator();
    int getSize();
}
