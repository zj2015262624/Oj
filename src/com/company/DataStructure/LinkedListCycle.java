package com.company.DataStructure;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        ListNode cur1 = head;
        ListNode cur2 = head;
        while(cur2 != null && cur2.next != null){
            cur1 = cur1.next;
            cur2 = cur2.next.next;
            if(cur1 == cur2){
                return true;
            }
        }
        return false;
    }
}
