package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.linkedlist.LinkedListiterator;

//todos los metodos deben ser publicos
//A la interfaz solo le interesa como funcionan los metodos
//A la interfaz no le importa el cuerpo
//Bajo acoplamiento -> una clase puede ser modificada sin afecar a otra
//Los generics solo funcionan para objetos
public interface List <T>{
    void addAtTail(T data) throws NotNullValuesAllowedException;
    void addAtFront ( T data ) throws NotNullValuesAllowedException;
    void remove ( int index ) throws NotValidIndexException;
    void removeAll();
    void setAt(int index, T data) throws NotNullValuesAllowedException, NotValidIndexException;
    T getAt(int index) throws NotValidIndexException;
    Iterator<T> getIterator();
    int getSize();
}
