// Last updated: 9/16/2026, 3:02:49 PM
1/*
2// Definition for Employee.
3class Employee {
4    public int id;
5    public int importance;
6    public List<Integer> subordinates;
7};
8*/
9
10class Solution {
11    public int getImportance(List<Employee> employees, int id) {
12        HashMap<Integer, Employee> hashMap = new HashMap<>();
13        for (Employee employee : employees) hashMap.put(employee.id, employee);
14        Queue<Employee> q = new LinkedList<>();
15        q.add(hashMap.get(id));
16        int sum = 0;
17        while (!q.isEmpty()) {
18            Employee emp = q.poll();
19            sum += emp.importance;
20            for (int i : emp.subordinates) q.add(hashMap.get(i));
21        }
22        return sum;
23    }
24}