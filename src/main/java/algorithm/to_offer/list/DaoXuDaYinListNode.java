package algorithm.to_offer.list;

import java.util.Stack;

/**
 * Created by Administrator on 2018/10/17.
 */

//将当前链表元素倒序打印到屏幕上
public class DaoXuDaYinListNode {
    public static void main(String[] args) {
        ListNode head = ListUtil.buildList(5);

//        recursionImpl(head);
        stackImpl(head);
    }

//    栈实现
    public static void stackImpl(ListNode head){
        Stack<ListNode> s = new Stack();

        while(head != null){
            s.add(head);
            head = head.next;
        }

        while (!s.isEmpty()) {
            ListNode topNode = s.pop();
            System.out.println(topNode.val);
        }

    }

//    递归实现
    public static void  recursionImpl(ListNode head){
        if(head != null && head.next != null){
            recursionImpl(head.next);
        }
        System.out.println(head.val);
    }

}
