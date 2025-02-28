public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Loop until either fast pointer reaches the end or both pointers meet
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1 step
            fast = fast.next.next;    // Move fast by 2 steps

            if (slow == fast) {       // If they meet, there is a cycle
                return true;
            }
        }

        return false; // No cycle found
    }
}