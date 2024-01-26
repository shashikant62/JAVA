class BasicLinkedlist{
    // public static void recurcive(node head){
    //     if(head!=null){
    //         return;
    //     }
    //     System.out.println(head.data+" ");
    //         recurcive(head.next);

    // }
   public static  class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        };
    }
    public static void main(String args[]){
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        node temp=a;
        // for(int i=0;i<4;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }

        //problem is a value change not functionality of a not preserve
        // while(a!=null){
        //     System.out.println(a.data);
        //     a=a.next;
        // }

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        //recurcively
        // recurcive(a);

        
    }
}