
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

    //反转链表
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //head是当前节点（要被改变的那个节点），pre是当前节点的前一个节点，next是当前节点的下一个节点
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;//首先记录当前节点的下一个节点，（保存起来）
            head.next=pre;//让当前节点指向前一个节点，因为要反序嘛
            pre=head;//让前一个节点值，取代当de前的节点值。因为要继续向下走
            head=next;//让下一个节点，取代当前节点。同样是向下走，为下一次循环做准备
        }
        return pre;
    }
}










