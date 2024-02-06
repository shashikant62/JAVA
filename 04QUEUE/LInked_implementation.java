class LInked_implementation{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    public static class ll{
        node head=null;
        node tail=null;
        int size=0;
        public void queueEnqueue(int data){
            node temp=new node(data);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public int queueDequeue(){
            node temp=head;
            if(size==0){
                return -1;
            }
            int x=head.data;
            head=head.next;
            return x;
        }

        public int peek(){
            if(size==0){
                return -1;
            }
            return head.data;
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
    public static void main(String args[]){
      ll a=new ll();
      a.display();
      a.queueEnqueue(1);  
      a.queueEnqueue(2);  
      a.queueEnqueue(3);  
      a.display();
      a.queueDequeue();
       a.display();
    }
}