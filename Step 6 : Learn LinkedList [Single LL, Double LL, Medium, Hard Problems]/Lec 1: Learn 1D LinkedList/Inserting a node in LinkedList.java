class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        // code here
        if(head==null){
            return newNode;
        }
        
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        
        return head;
    }
}
