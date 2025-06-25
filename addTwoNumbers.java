import java.lang.classfile.components.ClassPrinter.ListNode;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode num1 = l1;
        ListNode num2 = l2;

        ListNode answer = new ListNode(0);
        ListNode current = answer;

        int number1, number2, num3;
        int carry = 0;
        // process lists from left to right since they are already reversed
        // process the lists as long as there are digits in the lists as well as the
        // carried on value from the previous addition
        while (num1 != null || num2 != null || carry != 0) {
            // if the node exits, use the actual node value or else use 0 if it doesnt exist
            number1 = (num1 != null) ? num1.val : 0;
            number2 = (num2 != null) ? num2.val : 0;
            // add the 2 current digits we are iterating on and carry on values
            num3 = number1 + number2 + carry;

            carry = num3 / 10; // tens
            int digit = num3 % 10; // units

            current.next = new ListNode(digit); // create a new node with the value added
            current = current.next;// move pointer forward to continue building the list

            if (num1 != null)
                num1 = num1.next;// move forward if theres another node
            if (num2 != null)
                num2 = num2.next;
        }

        return answer.next;

    }
}