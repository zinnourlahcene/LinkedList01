package org.example;

public class LinkedList {
    private Link first;

    public LinkedList(){
        this.first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void insertFirst(Link link){
        link.next = this.first;
        this.first = link;
    }

    public void deleteFirst(){
        this.first = this.first.next;
    }

    public void displayList(){
        Link current = this.first;
        while (current != null){
            current.display();
            current = current.next;
        }
        System.out.println("");
    }



    public void recursiveDisplayList(Link link){
        if (link != null){
            link.display();
            recursiveDisplayList(link.next);
        }
        System.out.println("");
    }

    public Link find(int key){
        Link current = this.first;
        while (current.key != key){
            if (current.next != null){
                current = current.next;
            } else {
                return null;
            }
        }
        return current;
    }

    public Link delete(int key){
        Link current = this.first;
        Link previous = this.first;

        while (current.key != key){
            if (current.next == null){
                return null;
            } else {
                previous = current;
                current = current.next;
            }

        }
        if (current.next == this.first){
            this.first = this.first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

}
