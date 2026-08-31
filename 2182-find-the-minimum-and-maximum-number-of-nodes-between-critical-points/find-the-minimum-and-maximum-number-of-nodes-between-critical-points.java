/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int[] check(ListNode head) {
        ListNode temp = head;
        int c = 0;
        int prev = Integer.MIN_VALUE;
        ArrayList<Integer> l = new ArrayList<>();
        while (head.next != null) {
            c++;
            if (prev != Integer.MIN_VALUE) {
                if (prev < head.val && head.val > head.next.val) {
                    l.add(c);
                } else if (prev > head.val && head.val < head.next.val) {
                    l.add(c);
                }
            }
            prev = head.val;
            head = head.next;
        }
        if (c < 3) {
            return new int[] { -1, -1 };
        }
        int minn = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < l.size() - 1; i++) {
            minn = Math.min(minn, Math.abs(l.get(i) - l.get(i + 1)));
        }
        System.out.println(l.toString());
        if (minn == Integer.MAX_VALUE && maxx == Integer.MIN_VALUE) {
            return new int[] { -1, -1 };
        }
        return new int[] { minn, Math.abs(l.get(l.size() - 1) - l.get(0)) };
    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        return check(head);
    }
}