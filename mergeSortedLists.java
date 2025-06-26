import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.ArrayList;

public class mergeSortedLists {
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
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            int number1, number2;
            ArrayList<Integer> nums = new ArrayList<Integer>();
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }

            return dummy.next;

        }
    }
}
