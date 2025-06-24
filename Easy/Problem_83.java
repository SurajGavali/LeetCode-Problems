public class Problem_83{

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Problem_83 problem = new Problem_83();
        ListNode head = problem.new ListNode(1, problem.new ListNode(1, problem.new ListNode(2, problem.new ListNode(3, problem.new ListNode(3)))));
        ListNode sortedHead = deleteDuplicates(head);

        while(sortedHead != null){

            System.out.println(sortedHead.val);
            sortedHead = sortedHead.next;
        }
        
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        
        while(curr != null && curr.next != null){

            if(curr.val == curr.next.val){

                curr.next = curr.next.next;
            } else{
                curr = curr.next;
            }

        }

        return head;
        
    }
}