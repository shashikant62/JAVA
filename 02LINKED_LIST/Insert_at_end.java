class Insert_at_end{
    public static class node{
        int data;
        node next;
        node(int val){
            this.data=val;
        }
    }
    public static class linkelist{
        node head=null;
        node tail=null;

       public void add(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
       }

       public void display(){
          node temp=head;
          while(temp!=null){
          System.out.print(temp.data+" ->");
          temp=temp.next;
       }
       System.out.print(" null");
       }
    }
    public static void main(String args[]){
        linkelist ll=new linkelist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
    }
}