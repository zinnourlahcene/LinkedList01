package org.example;

public class DoubleEndedList {
    public Link first;
    public Link last;

    public DoubleEndedList(Link first, Link last) {
        this.first = first;
        this.last = last;
    }

    public Link insertFirst(Link link){

        first.next = link;
        last = link;
        return null;

    }

    public Link insertLast(Link link){


        return null;

    }

    public Link deleteFirst(){

        return null;

    }

    public Link deleteLast(){

        return null;

    }

    public void display(){

    }

    public void displayRecursive(){

    }

    public Link find(int key){


        return null;
    }

    public Link delete(int key){


        return null;
    }
}
