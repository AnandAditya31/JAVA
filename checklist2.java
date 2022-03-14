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
public class checklist2 {
    static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.print("null");
    }
    static boolean detect(Node head)
    {
        Node f=head;
        Node s=head;
        while(f!=null&&s!=null&&f.next!=null&&s.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)
            return true; 
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        //int n=sc.nextInt();
        /*int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        */
        Node head=null;
        for(int i=arr.length-1;i>=0;i--)
        {
            head=new Node(arr[i],head);
        }
        
        head.next.next.next.next.next=head.next.next;
        if(detect(head))
        System.out.println("Present");
        else
        System.out.println("Nahi h lawde");

    }
}
