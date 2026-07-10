// Last updated: 7/10/2026, 8:50:12 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode less = new ListNode(-1);
14        ListNode res = less;
15        ListNode great = new ListNode(-1);
16        ListNode res2 = great;
17        while(head!=null)
18        {
19            if(head.val<x)
20            {
21                less.next = head;
22                less = head;
23                head = head.next;
24                less.next =null;
25            }
26            else
27            {
28                great.next = head;
29                great = head;
30                head= head.next;
31                great.next = null;
32            }
33        }
34        less.next = res2.next;
35        return res.next;
36    }
37}