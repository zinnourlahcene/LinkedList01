package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Link {
    public int key;
    public int data;
    public Link next;

    public Link(int key, int data) {
        this.key = key;
        this.data = data;
    }

    public void display(){
        System.out.println("Data = "+ this.data);
    }
}