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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      // Create a dummy node to serve as the predecessor of the original list
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;

    // Move prev to the node before the sublist to be reversed
    for (int i = 0; i < left - 1; i++) {
        prev = prev.next;
    }

    // Initialize pointers for reversing the sublist
    ListNode current = prev.next;
    ListNode nextNode;

    // Reverse the sublist from left to right
    for (int i = 0; i < right - left; i++) {
        nextNode = current.next;
        current.next = nextNode.next;
        nextNode.next = prev.next;
        prev.next = nextNode;
    }

    return dummy.next;
    }
}