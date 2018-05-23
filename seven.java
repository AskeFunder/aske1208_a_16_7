package SorteOpgaver.ch16.aske1208_a_16_7;

import SorteOpgaver.ch16.LinkedIntList;
import SorteOpgaver.ch16.ListNode;

public class seven
{
    public ListNode deleteBack(LinkedIntList linkedIntList)
    {
        ListNode lastNode = null;
        int size = linkedIntList.size();
        ListNode current = linkedIntList.getFront();

        for (int i = 0; i < size; i++)
        {
            if (i == size - 2)
            {
                lastNode = current.next;
                current.next = null;
                return lastNode;
            }
            current = current.next;
        }

        return lastNode;
    }
}
