package findlastkth;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author yingfeng
 * @date 2020/2/16 22:24:14
 */
public class Solution {
    public static ListNode FindKthToTail(ListNode head,int k) {
        int count = 0;
        ListNode result = head;

        if(k < 1) {
            return null;
        }

        while (head != null){
            if (count >= k) {
                result = result.next;
            }
            head = head.next;
            count++;
        }

        if (count < k) {
            return null;
        }

        return result;
    }


    public static void main(String[] args) {
        ListNode head = ListNode.createList(new int[]{1, 2, 3, 4, 5});
        ListNode.display(head);

        System.out.println(FindKthToTail(head, 15));
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    static ListNode createList(int[] a){
        ListNode head = new ListNode(a[0]);
        ListNode flag = head;

        for (int i = 1; i < a.length; i++) {
            head.next = new ListNode(a[i]);
            head = head.next;
        }
        return flag;
    }

    static void display(ListNode listNode){
        ListNode loop = listNode;
        while(loop != null){
            System.out.print(loop.val + " ");
            loop = loop.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "" + val;
    }
}
