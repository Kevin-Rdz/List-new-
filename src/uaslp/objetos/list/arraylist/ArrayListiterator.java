package uaslp.objetos.list.arraylist;

public class ArrayListiterator {
    private ArrayList arrayList;
    private int currentItem;
    public ArrayListiterator(ArrayList arrayList){
        this.arrayList = arrayList;
    }
    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }
    public String next(){
        String data = arrayList.getAt(currentItem);
        currentItem++;
        return data;
    }
}
