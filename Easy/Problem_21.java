class Problem_21{

    // https://leetcode.com/problems/merge-two-sorted-lists/description/

    public class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        Problem_21 problem = new Problem_21();
        ListNode l1 = problem.new ListNode(1, problem.new ListNode(2, problem.new ListNode(4)));
        ListNode l2 = problem.new ListNode(1, problem.new ListNode(3, problem.new ListNode(4)));
        
        ListNode nodeStart = mergeTwoList(l1, l2);

        while (nodeStart != null) {
            System.out.print(nodeStart.val + " ");
            nodeStart = nodeStart.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoList(ListNode l1, ListNode l2){

        Problem_21 problem = new Problem_21();

        ListNode dummy = problem.new ListNode(0);
        ListNode current = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        }else{
            current.next = l2;
        }
        return dummy.next;
    }

}