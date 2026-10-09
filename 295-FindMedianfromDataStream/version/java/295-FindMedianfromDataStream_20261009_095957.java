// Last updated: 10/9/2026, 9:59:57 AM
1class MedianFinder {
2    
3    ArrayList<Integer> list;
4
5    public MedianFinder() {
6        list = new ArrayList<>();
7    }
8    
9    public void addNum(int num) {
10        int i;
11        if(list.size() > 0){
12            for (i = 0; (i < list.size()  && list.get(i) < num); i++);
13            list.add(i , num);
14        }else{
15            list.add(num);
16        }
17    }
18    
19    public double findMedian() {
20        // System.out.println(list);
21        int index = list.size()/2;
22        if(list.size() % 2 == 0){
23            return (double) (list.get(index) + list.get(index - 1))/2;
24        }else{
25            return list.get(index);
26        }
27        
28    }
29}