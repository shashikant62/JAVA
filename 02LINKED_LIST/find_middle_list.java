class find_middle_list {
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

    void findmid() {
      node temp = head;
      int len = 0;
      while (temp != null) {
        len++;
        temp = temp.next;
      }
      temp = head;
      int mid = len / 2;
      if (mid % 2 == 0) {
        for (int i = 0; i < mid; i++) {
          temp = temp.next;
        }
      } 
      else {
        for (int i = 0; i < mid; i++) {
          temp = temp.next;
        }
      }
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.println(" null");
    }
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
  }
  public static void main(String args[]) {

    linkedlist ll = new linkedlist();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.display();
    ll.findmid();
  }
}
