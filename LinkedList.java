public class LinkedList
{
    
    private class Node
    {
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public  void addFirts(int item)//O(1)
    {
        Node nn= new Node();
        nn.val=item;
        if(this.size==0)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    //O(1)
    public void addLast(int elem)
    {
        if(size==0)
        {
            addFirts(elem);
        }
        else
        {
            Node nn = new Node();
            nn.val=elem;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    private Node GetNode(int k) throws Exception
    {
        Node temp=head;
        if(k<0 || k>size)
        {
            throw new Exception("K out of range");
        }
        else
        {
            int c=1;
           
            while(c++!=k)
            {
                temp=temp.next;
            }
        }
        return temp;
    }
    public void addAtPos(int elem,int pos) throws Exception
    {
        if(pos<0 || pos>=size)
        {
            throw new Exception("K out of range");
        }
        if(pos==0)
        {
            addFirts(elem);
        }
        else if(pos==size)
        {
            addLast(elem);
        }
        else
        {
            Node temp=GetNode(pos-1);
            Node temp2=temp.next;
            Node nn = new Node();
            nn.val=elem;
            temp.next=nn;
            nn.next=temp2;
        }
    }
    public int getFirst()
    {
        return head.val;
    }
    public int getLast()
    {
        return tail.val;
    }
    public int getPos(int pos) throws Exception
    {
        return GetNode(pos).val;
    }
    public int  removeFirst()
    {
        Node temp=head;
        if(size==0)
        {
            System.out.println("size is zero");
            return -1;
        }
        if(size ==1)
        {
            head=null;
            tail=null;
            size--;
        }
        else{
            head=head.next;
            temp.next=null;
            size--;
        }
        return temp.val;
    }
    public int removeLast() throws Exception
    {
        if(size==1)
        {
            return removeFirst();
        }
        else{
            Node ss= GetNode(size);
            int rv = tail.val;
            tail=ss;
            tail.next= null;
            size--;
            return rv;
        }
    }
    public int removeAtpos(int pos) throws Exception
    {
        if(pos==1)
        {
            return removeFirst();
        }
        else if(pos==size)
        {
            return removeLast();
        }
        else
        {
            Node prev = GetNode(pos-1);
           Node curr = prev.next;
           prev.next=curr.next;
           curr.next=null;
           size--;
           return curr.val;
        }
        
    }
    public void removeelem(int elem) throws Exception
    {
        Node temp=head;
        if(temp==null)
        {
            
        }
        while(temp!=null)
        {
            if(temp.next.val==elem && temp.next!=null)
            {
                temp.next=temp.next.next;
                
            }
            else
            temp=temp.next;
        }
        if(temp.val==elem)
        {
            temp.next=null;
        }
    }
    public   void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) throws Exception
    {
        LinkedList ll = new LinkedList();
        ll.addFirts(0); 
        ll.addFirts(1); 
        ll.addFirts(2); 
        ll.addFirts(4); 
        ll.addFirts(4);  
        ll.addLast(55);
        ll.addAtPos(100,2);
        ll.display();
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());
        // System.out.println(ll.getPos(2));
        // System.out.println(ll.removeFirst());
        //
        // System.out.println(ll.removeAtpos(2));
        // System.out.println(ll.removeLast());
        ll.removeelem(4);
        ll.display();
    }
}