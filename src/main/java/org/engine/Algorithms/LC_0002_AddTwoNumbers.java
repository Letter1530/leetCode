package org.engine.Algorithms;

public class LC_0002_AddTwoNumbers {

    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Constraints:
    1.The number of nodes in each linked list is in the range [1, 100].
    2.0 <= Node.val <= 9
    3.It is guaranteed that the list represents a number that does not have leading zeros.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0);
        ListNode res = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {

            int sum = 0;

            if (l1 != null) {
                sum += l1.getVal();
                l1 = l1.getNext();
            }
            if (l2 != null) {
                sum += l2.getVal();
                l2 = l2.getNext();
            }

            sum += carry;
            temp.setNext(new ListNode(sum % 10));
            carry = sum / 10;

            temp = temp.getNext();
        }

        return res.getNext();
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static class ListNode {

        private Integer val;
        private ListNode next;
        private boolean hasNext = false;

        ListNode(int val) {
            this.val = val;
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
            this.hasNext = true;
        }

        public boolean hasNext() {
            return hasNext;
        }
    }

    public ListNode convertor(int[] arr) {

        ListNode temp = new ListNode(0);
        ListNode res = temp;

        for (int i : arr) {
            temp.setNext(new ListNode(i));
            temp = temp.getNext();
        }

        return res.getNext();
    }
}
