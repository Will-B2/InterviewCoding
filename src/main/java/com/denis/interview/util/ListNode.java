package com.denis.interview.util;

/**
 * Util class for linked list tasks
 */
public class ListNode<T> {

    private T value;
    private ListNode<T> next;


    public ListNode(T value) {
        this.value = value;
    }

    public ListNode() {

    }

    public void getLineage(ListNode<T> head) {

        ListNode<T> pointer = head;

        while (pointer != null) {
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getNext();
        }
        System.out.println();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
