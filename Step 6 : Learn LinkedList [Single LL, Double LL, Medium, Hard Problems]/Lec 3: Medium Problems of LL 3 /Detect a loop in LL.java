public class Solution {
  
    public boolean hasCycle(ListNode head) {
        ListNode list1=head;
        ListNode list2=head;
        while(list1!=null && list1.next!=null){
            list2=list2.next;
            list1=list1.next.next;

            if(list1==list2){
                return true;
            }
        }
        return false;
    }
}
