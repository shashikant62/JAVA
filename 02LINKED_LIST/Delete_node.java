class Delete_node{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkelist{
        node head=null;
        node tail=null;

        public void insert(int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }

        }
        public void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
             System.out.println("null");
        }

    }
    }

    public static void main(String args[]){
        linkelist ll=new linkelist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.display();
        ll.addAtIndex(0,45);
        ll.display();
    }
}