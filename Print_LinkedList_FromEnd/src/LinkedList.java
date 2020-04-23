import java.util.ArrayList;
import java.util.Stack;

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

    //从尾到头打印链表
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = listNode;  //辅助指针，不改变头指针。
        while (temp != null) {
            stack.push(temp);//入栈
            temp = temp.next;
        }
        //
        while (stack.size() > 0) {
            ListNode node = stack.pop();//出栈
            arrayList.add(node.val);
        }
        return arrayList;
    }

}
