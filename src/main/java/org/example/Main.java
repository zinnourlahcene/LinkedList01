package org.example;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(new Link(4, 44));
        linkedList.insertFirst(new Link(3, 33));
        linkedList.insertFirst(new Link(2, 22));
        linkedList.insertFirst(new Link(1, 11));
        System.out.println(linkedList.isEmpty());

        linkedList.recursiveDisplayList(linkedList.getFirst());

        int key = 37;
        Link link = linkedList.find(key);
        if (link == null){
            System.out.println("No link with the key = "+ key);
        } else {
            System.out.println("Found a link with the key = "+ key + " and data = "+ link.data);
        }

        int key2 = 4;
        Link link2 = linkedList.delete(key2);
        if (link2 == null){
            System.out.println("No link with the key = "+ key2);
        } else {
            System.out.println("Deleted a link with the key = "+ key2 + " and data = "+ link2.data);
        }

        linkedList.displayList();

    }
}