// Last updated: 10/15/2026, 7:19:25 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode insertionSortList(ListNode head) {
13         ListNode dummy= new ListNode(0);
14        ListNode current=head;
15        while(current != null){
16            ListNode prev=dummy;
17            ListNode nextNode=current.next;
18            while(prev.next!=null && prev.next.val < current.val){
19                prev=prev.next;
20            }
21            current.next=prev.next;
22            prev.next=current;
23            current=nextNode;
24        }
25        return dummy.next;
26    }
27}