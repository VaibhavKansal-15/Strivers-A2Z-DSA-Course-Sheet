class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node last=head;
        if(head==null){
            return false;
        }
        while(last!=null){
            if(last.data==key){
                return true;
            }else{
                last=last.next;
            }
        }
        return false;
    }
}
