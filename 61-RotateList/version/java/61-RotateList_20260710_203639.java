// Last updated: 7/10/2026, 8:36:39 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null||head.next==null)
14        return head;
15        ListNode prev = new ListNode(-1);
16        ListNode dummy = prev;
17        dummy.next=head;
18        ListNode curr = head;
19        while(curr!=null&&curr.next!=null)
20        {
21            if(curr.val==curr.next.val)
22            {
23                while(curr.next!=null&&curr.val==curr.next.val)
24                {
25                    curr=curr.next;
26                }
27                dummy.next=curr.next;
28            }
29            else
30            {
31                dummy=dummy.next;
32            }
33            curr=curr.next;
34        }
35        return prev.next;
36    }
37}