class DoublyLinkedlist_Basic{
    public static class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    //inserttion at head

    public static Node insertionhead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    // inset at tail
     public static void insertiontail(Node head,int x){
        Node temp=head;
        Node t=new Node(x);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
        t.prev=temp;
    }
    //insert at random
    public static void insertionindex(Node head,int idx,int x){
        Node s=head;
        for(int i=0;i<idx-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    //print from head
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //print from tail
    public static void displaytail(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.println("null");
        
    }

    //random node print
     public static void displayrandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public static void main(String args[]){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=null;
        // display(a);
        // displaytail(d);
        // displayrandom(c);
        // Node newhead=insertionhead(a,3);
        // display(newhead);
        // insertiontail(a,45);
        // display(a);
        insertionindex(a,2,90);
        display(a);
    }

}