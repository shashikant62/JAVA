class Insert_at_end{
    public  static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        node head=null;
        node tail=null;
        public void insert(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
       }


        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print(" null");
        }
    }
    public static void main(String args[]){

        linkedlist ll=new linkedlist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.display();
    }
}