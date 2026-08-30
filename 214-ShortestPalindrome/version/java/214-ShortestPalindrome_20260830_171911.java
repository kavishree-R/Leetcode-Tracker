// Last updated: 8/30/2026, 5:19:11 PM
1class Solution {
2    public double[] medianSlidingWindow(int[] nums, int k) {
3        if (nums == null || nums.length == 0)
4            return new double[0];
5        
6        Node root = null;
7        for (int i = 0; i < k; i++) {
8            root = insert(root, nums[i]);
9        }
10        
11        double[] r = new double[nums.length - k + 1];
12        boolean even = k % 2 == 0;
13        int j = 0;
14        for (int i = k; i <= nums.length; i++) {
15            double sum = 0.0;
16            if (even)
17                sum = (findSmallest(root, k/2).val + findSmallest(root, k/2 + 1).val) / 2.0;
18            else
19                sum = findSmallest(root, k/2 + 1).val;
20            r[j++] = sum;
21            if (i < nums.length) {
22                root = insert(root, nums[i]);
23                root = delete(root, nums[i - k]);
24            }
25        }
26        
27        return r;
28    }
29    
30    private Node findSmallest(Node root, int k) {
31        int s = countWith(root.left) + 1;
32        if (s == k)
33            return root;
34        if (s > k) {
35            return findSmallest(root.left, k);
36        }
37        return findSmallest(root.right, k - s);
38    } 
39  
40    private Node delete(Node root, long val) {
41        if (root == null)
42            return null;
43        else if (val > root.val) 
44            root.right = delete(root.right, val);
45        else if (val < root.val)
46            root.left = delete(root.left, val);
47        else {
48            if (root.left == null)
49                root = root.right;
50            else if (root.right == null)
51                root = root.left;
52            else {
53                Node t = findMin(root.right);
54                root.val = t.val;
55                root.right = delete(root.right, t.val);
56            }
57        }
58        
59        return updateNode(root);
60    }
61    
62    private Node findMin(Node root) {
63        if (root.left != null)
64            return findMin(root.left);
65        return root;
66    }
67
68    private Node insert(Node root, long val)
69    {
70        if (root == null)
71        {
72            return new Node(val);
73        }
74        if (val >= root.val)
75        {
76            root.right = insert(root.right, val);
77        }
78        else
79        {
80            root.left = insert(root.left, val);
81        }
82       
83        return updateNode(root);
84    }
85    
86    private Node updateNode(Node root) {
87        int b = balance(root); 		
88        if (b == 2 && balance(root.left) < 0)
89        {
90            root.left = leftRotate(root.left);
91            root = rightRotate(root);
92        }
93        else if (b == -2 && balance(root.right) > 0)
94        {
95            root.right = rightRotate(root.right);
96            root = leftRotate(root);
97        }
98        else if (b == 2)
99        {
100            root = rightRotate(root);
101        }
102        else if (b == -2)
103        {
104            root = leftRotate(root);
105        }
106        update(root);
107        return root;
108    }
109
110    private Node leftRotate(Node n)
111    {
112        Node r = n.right;
113        n.right = r.left;
114        r.left = n;
115        update(n);
116        update(r);
117        return r;
118    }
119
120    private Node rightRotate(Node n)
121    {
122        Node l = n.left;
123        n.left = l.right;
124        l.right = n;
125        update(n);
126        update(l);
127        return l;
128    }
129
130    private int balance(Node n)
131    {
132        if (n==null)return 0;
133        return height(n.left) - height(n.right);
134    }
135
136    private void update(Node n)
137    {
138        if (n==null)return;
139        n.height = Math.max(height(n.left), height(n.right)) + 1;
140        n.count = n.left != null ? n.left.count + 1 : 0;
141        n.count += n.right != null ? n.right.count + 1 : 0;
142    }
143
144    private int height(Node n)
145    {
146        return n != null ? n.height : 0;
147    }
148
149    private int countWith(Node n)
150    {
151        return n != null ? n.count + 1 : 0;
152    }
153
154    static class Node
155    {
156        Node left;
157        Node right;
158        long val;
159        int count;
160        int height;
161
162        Node(long val)
163        {
164            this.val = val;
165        }
166    }
167}