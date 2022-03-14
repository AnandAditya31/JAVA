import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
public class checklist1 {
    static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.print("null");
    }
    static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        Node head=null;
        for(int i=arr.length-1;i>=0;i--)
        {
            head=new Node(arr[i],head);
        }
        head= reverse(head);
        printList(head);
    }
}
