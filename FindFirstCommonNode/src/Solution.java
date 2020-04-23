public class Solution {
    //测试方法
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(5);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(1);
        linkedList2.add(3);
        linkedList2.add(5);
        linkedList2.add(9);
        linkedList2.add(10);

     //   System.out.println(linkedList);
    //    System.out.println(linkedList2);
        ListNode node = LinkedList.FindFirstCommonNode(linkedList.head, linkedList2.head);

        while (node!=null) {
            System.out.println(node.val);
            node=node.next;
        }
        System.out.println(node);
    }
}