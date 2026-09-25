class Node {
    Integer key;
    Integer value;
    Node next;

    Node(Integer key, Integer value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyHashMap {

    Node[] buckets;

    public MyHashMap() {
        buckets = new Node[10];
    }

    public void put(int key, int value) {

        int index = key % buckets.length;

        Node current = buckets[index];

        if (current == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        Node previous = current;

        while (current != null) {

            if (current.key == key) {
                current.value = value;
                return;
            }

            previous = current;
            current = current.next;
        }

        previous.next = new Node(key, value);
    }

    public int get(int key) {

        int index = key % buckets.length;

        Node current = buckets[index];

        while (current != null) {

            if (current.key == key) {
                return current.value;
            }

            current = current.next;
        }

        return -1;
    }

    public void remove(int key) {

        int index = key % buckets.length;

        Node current = buckets[index];
        Node previous = current;

        if (current != null && current.key == key) {
            buckets[index] = current.next;
            return;
        }

        while (current != null) {

            if (current.key == key) {
                previous.next = current.next;
                return;
            }

            previous = current;
            current = current.next;
        }
    }
}