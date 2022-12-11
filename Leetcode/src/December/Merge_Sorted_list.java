package December;
/*
 * 
 * 
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 * 
 */


// Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode mergeNode;
        if(list1.val<list2.val){
            mergeNode=list1;
            mergeNode.next = mergeTwoLists(list1.next, list2);
        }else{
            mergeNode=list2;
            mergeNode.next = mergeTwoLists(list1, list2.next);
        }
        return mergeNode;

    }
}
public class Merge_Sorted_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: list1 = [1,2,4], list2 = [1,3,4]
		//Output: [1,1,2,3,4,4]


	}

}
