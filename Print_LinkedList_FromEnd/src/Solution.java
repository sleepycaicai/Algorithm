import java.util.ArrayList;

public class Solution {
    //测试方法
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println(linkedList.printListFromTailToHead(linkedList.head));
    }
}