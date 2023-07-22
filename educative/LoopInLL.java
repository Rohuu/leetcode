public class LoopInLL {
    static boolean checkCycle(Node head){
        if(head==null){
            return false;
        }
        Node fast=head;         // 1-> 2     // 1-7-8-9-7     //
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
