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


    //合并2个有序链表
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode first = new ListNode(0);
        ListNode temp = first;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;

            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if (list1 == null) {
            temp.next = list2;
        }
        if (list2 == null) {
            temp.next = list1;
        }

        return first.next;
    }
}
