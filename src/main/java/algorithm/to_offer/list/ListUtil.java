package algorithm.to_offer.list;

/**
 * Created by Administrator on 2018/10/17.
 */
public class ListUtil {

//    根据传入的链表长度构建链表
    public static ListNode buildList(int length){
        ListNode head = new ListNode(1);
        ListNode pre = head;
        for(int i = 2; i <= length; i++){
            pre.next = new ListNode(i);
            pre = pre.next;

        }
        return head;
    }
}
