package MotadataString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MultiHashMap<K, V> {

    // Each bucket contains a linked list of Nodes
    private Node<K, V>[] table;

    private int size;

    private static final int DEFAULT_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public MultiHashMap() {
        table = new Node[DEFAULT_CAPACITY];
    }

    // Same basic hash spreading idea as HashMap
    private int hash(K key) {
        int h = (key == null) ? 0 : key.hashCode();
        return h ^ (h >>> 16);
    }

    private int index(int hash) {
        return hash & (table.length - 1);
    }

    public void put(K key, V value) {

        int hash = hash(key);
        int index = index(hash);

        Node<K, V> newNode =
                new Node<>(hash, key, value);

        // Empty bucket
        if (table[index] == null) {
            table[index] = newNode;
        } else {

            // Go to the end of the linked list
            Node<K, V> current = table[index];

            while (current.next != null) {
                current = current.next;
            }

            // IMPORTANT:
            // Don't check equals() and overwrite.
            // Always add a new node.
            current.next = newNode;
        }

        size++;
    }

    public List<V> get(K key) {

        List<V> result = new ArrayList<>();

        int hash = hash(key);
        int index = index(hash);

        Node<K, V> current = table[index];

        while (current != null) {

            if (current.hash == hash &&
                    Objects.equals(current.key, key)) {

                result.add(current.value);
            }

            current = current.next;
        }

        return result;
    }

    public int size() {
        return size;
    }

    public void printAll() {

        for (Node<K, V> bucket : table) {

            Node<K, V> current = bucket;

            while (current != null) {

                System.out.println(
                        current.key + " -> " + current.value
                );

                current = current.next;
            }
        }
    }

    // Node = one key-value pair
    private static class Node<K, V> {

        int hash;
        K key;
        V value;

        Node<K, V> next;

        Node(int hash, K key, V value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }
    }
}