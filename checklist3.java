import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
//Intersection Point
public class checklist3 {
    static int intersect(Node head1, Node head2)
    {
         Node c1=head1;
         Node c2=head2;
         Node t1=head1;
         Node t2=head2;
         int size1=0;
         int size2=0;
         while(c1!=null)
         {
             size1++;
             c1=c1.next;
         }
         while(c2!=null)
         {
             size2++;
             c2=c2.next;
         }
         int d=Math.abs(size1-size2);
         if(size1>size2)
         {
             for(int i=0;i<d;i++)
             {
                 t1=t1.next;
             }
             
         }
         else
         {
             for(int i=0;i<d;i++)
             {
                 t2=t2.next;
             }
         }
         while(t1!=t2)
         {
             t1=t1.next;
             t2=t2.next;
         }
         return t1.data;
    }
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
        Node head1 = null;
        for (int i = arr1.length - 1; i >= 0; i--)  {
            head1 = new Node(arr1[i], head1);
        }
        Node head2 = null;
        for (int i = arr2.length - 1; i >= 0; i--)  {
            head1 = new Node(arr2[i], head2);
        }
        int ans=intersect(head1,head2);
        System.out.println(ans);*/
      checklist3 list = new checklist3();
      list.head1 = new checklist3(5);
      list.head1.next = new listnode(4);
      list.head1.next.next = new listnode(9);
      list.head1.next.next.next = new listnode(7);
      list.head1.next.next.next.next = new listnode(1);
      list.head2 = new listnode(6);
      list.head2.next = new listnode(7);
      list.head2.next.next = new listnode(1);
      System.out.println(list.commonPoint(headA, headB));


    }
    
}
