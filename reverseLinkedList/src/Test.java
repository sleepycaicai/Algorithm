public class Test {
    //测试
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        ListNode node = linkedList.ReverseList(linkedList.head);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
