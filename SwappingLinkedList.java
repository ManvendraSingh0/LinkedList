public class SwappingLinkedList {
    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirts(int elem)
    {
        Node nn = new Node();
        nn.val=elem;
        if(this.size==0)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else
       {
        nn.next=head;
        head=nn;
        size++;
       }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("Size "+size);
    }
    public void SwapElem(int k)
    {
        int b=k;
        int e=size-k;
        int c1=1;
        int c2=0;
        Node temp1=head;
        Node temp2=head;
        if(head==null)
        {
            System.out.println(head);
            return;
        }
        while( temp1!=null &&c1++!=b)
        {
            temp1=temp1.next;
        }
        while(temp2!=null && c2++!=e)
        {
            temp2=temp2.next;
        }
        int temp;
        temp=temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;

    }
    public static void main(String[] args) {
        SwappingLinkedList ll = new SwappingLinkedList();
        ll.addFirts(4);
        ll.addFirts(5);
        ll.addFirts(6);
        ll.addFirts(7);
        ll.addFirts(8);
        ll.addFirts(9);
        ll.addFirts(1);
        ll.display();
        ll.SwapElem(2);
        ll.display();

    }

}
