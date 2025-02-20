class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        if(head==null){
            return 0;
        }
        
        int count=1;
        Node last=head;
        while(last.next!=null){
            last=last.next;
            count++;
        }
        return count;
    }
}
