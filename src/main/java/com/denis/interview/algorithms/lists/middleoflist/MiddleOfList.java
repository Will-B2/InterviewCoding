package com.denis.interview.algorithms.lists.middleoflist;

import com.denis.interview.util.ListGenerator;
import com.denis.interview.util.ListNode;

/**
 * Find middle of list with one iteration
 */
public class MiddleOfList {

    public static ListNode<Integer> getMiddleElement(ListNode<Integer> head) {

        var fastPointer = head;
        var slowPointer = head;

        if (head != null) {
            while (fastPointer != null && fastPointer.hasNext()) {
                fastPointer = fastPointer.getNext().getNext();
                slowPointer = slowPointer.getNext();
            }
        }
        return slowPointer;
    }

    public static void main(String[] args) {

        ListNode<Integer> first = ListGenerator.generateList(1, 10, true);

        System.out.println(getMiddleElement(first).getValue());

    }
}
