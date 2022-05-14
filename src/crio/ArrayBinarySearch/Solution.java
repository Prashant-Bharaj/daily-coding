package crio.ArrayBinarySearch;

import java.util.* ;
import java.io.*;
class LinkedListNode<T> {
    T data;
    LinkedListNode next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
/************************************************************

 Following is the linked list node structure:



 ************************************************************/

public class Solution {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer> ans = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> curr = ans;
        while(first != null && second != null){
            if(first.data <= second.data){
                curr.next = new LinkedListNode(first.data);
                first = first.next;
                curr = curr.next;
            } else {
                curr.next = new LinkedListNode(second.data);
                curr = curr.next;
            }
        }
        if(first != null){

            curr.next = first;

        }else if(second != null){
            curr.next = second;
        }
        return ans.next;
    }
}
