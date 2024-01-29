class Reverce_linkedlist_Iterativ{
  public static class node {
    int data;
    node next;
    node(int data) {
      this.data = data;
    }
  }

  public static class linkedlist {
    node head = null;
    node tail = null;

    void insert(int data) {
      node temp = new node(data);
      if (head == null) {
        head = tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }
    }

    void display() {
      node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.println(" null");
    }
    void reverce(){
        if(head==null || head.next==null){
            return;
        }
        node prev=head;
        node curr=head.next;
        while(curr!=null){
            node currnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currnext;
        }
        head.next=null;
        head=prev;
    }
    void displayreverce() {
      node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.println(" null");
    }
  }
  public static void main(String args[]) {

    linkedlist ll = new linkedlist();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.display();
    ll.reverce();
    // ll.displayreverce();
    ll.display();

  }
}
