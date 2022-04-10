package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

public class ArrayListiterator<T> implements Iterator<T> {
    private final ArrayList<T> arrayList;
    private int currentItem;
    public ArrayListiterator(ArrayList<T> arrayList){
        this.arrayList = arrayList;
    }
    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }
    public T next(){
        T data = arrayList.getAt(currentItem);
        currentItem++;
        return data;
    }
}
