package list_linkedlist.avecpattern;

import list_linkedlist.ArrayMaList;

import java.util.Iterator;

public class ArrayMaListIterator implements Iterator<String> {

    private ArrayMaList arrayMaList;
    private int i = 0;

    public ArrayMaListIterator(ArrayMaList arrayMaList) {
        this.arrayMaList = arrayMaList;
    }

    @Override
    public boolean hasNext() {
        return i < this.arrayMaList.size();
    }

    @Override
    public String next() {
        String array = this.arrayMaList.get(i);
        i++;
        return array;
    }
}
