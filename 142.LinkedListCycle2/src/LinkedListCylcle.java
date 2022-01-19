class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return null;
        }

        ListNode fastPoint = head;
        ListNode slowPoint = head;

        while(fastPoint!=null){
            if(fastPoint.next == null){
                return null;
            }
            fastPoint = fastPoint.next.next;
            slowPoint = slowPoint.next;

            if(fastPoint == slowPoint){
                fastPoint = head;
                while(fastPoint != slowPoint){
                    fastPoint = fastPoint.next;
                    slowPoint = slowPoint.next;
                }
                return fastPoint;
            }

        }
        return null;

    }
}
public class LinkedListCylcle {
    public static void main(String[] args) {

    }
}
