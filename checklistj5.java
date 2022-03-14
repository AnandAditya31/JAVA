import java.util.*;
class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
 
   
}
 
class checklistj5
{
    public void addToTheLast(Node head) 
{
    if (head == null)
    {
        head = node;
    }
    else 
    {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }
}
  
/* Method to print linked list */
void printList()
{
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } 
    System.out.println();
}
   