package org.example.lesson4.Classwork;

public class Ex1 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pred = null;
            ListNode current = head;
            while (current != null) {
                ListNode nextElem = current.next;
                current.next = pred;
                pred = current;
                current = nextElem;
            }
            return pred;
        }

        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
       /**          public ListNode reverseList(ListNode head) {
        //        ListNode pred = null;
         //       ListNode current = head;
           //     while (current != null) {
                    ListNode nextElem = current.next;
                    current.next = pred;
                    pred = current;
                    current = nextElem;
                }
                return pred;
            }*/
        }
    }

