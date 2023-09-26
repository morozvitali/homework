package map;

public class MyHashMap <V, K> implements MyMap <V,K> {

    private int size;
    private Node <K, V> [] table;

    //констр

    public MyHashMap () {

    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void put(V key, K value) {

    }

    @Override
    public K get(V key) {
        return null;
    }

    @Override
    public void remove(V key) {

    }

    @Override
    public boolean contains(V key) {
        return false;
    }



    private class Node <V, K> {
        K key;
        V value;
        Node <K, V> next;
        int hash;
    }

}
