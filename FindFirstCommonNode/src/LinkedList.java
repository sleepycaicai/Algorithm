import java.util.HashMap;

public class LinkedList {
    ListNode head;  //其实就是之前常写的链表的头指针first

    //增
    public void add(int number) {
        ListNode listNode = new ListNode(number);
        listNode.next = null;
        if (head == null) {
            head = listNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = listNode;
        }
    }

    //打印链表
    @Override
    public String toString() {
        //[a,b,c]  first=a,last=c
        StringBuilder sb = new StringBuilder("[");
        //挨个遍历链表中的元素
        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.val + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');
        System.out.println("sb:" + sb);   //调用StringBuilder类的toString方法
        return sb.toString();   //sb是StringBuilder类型，不是String类型，不能直接return
    }

    //找出两个链表的第一个公共结点
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //0、特殊情况的判断
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
//1、遍历第一个链表，存入map中
        while (pHead1!=null) {
            hashMap.put(pHead1,0);
            pHead1=pHead1.next;
        }
//2、遍历第2个链表，查看map中是否包含某个节点
        while(pHead2!=null){
            if(hashMap.containsKey(pHead2)){
                return pHead2;
            }else{
                pHead2=pHead2.next;
            }
        }
        return null;
    }
}
