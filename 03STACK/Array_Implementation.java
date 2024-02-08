class Array_Implementation{
    public static class Stack{
        private int[] arr=new int[4];
        int idx=0;

        void push(int val){
            int len=arr.length;
            if(idx==len){
                System.out.println("stack full");
            }
            else{
            arr[idx]=val;
            idx++;
        }
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<idx;i++){
                  System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }

        int size(){
            return idx;
        }

        boolean isempty(){
            if(idx==0){
                return true;
            }
            return false;
        }

        boolean isfull(){
            if(arr.length==idx)return true;
            return false;
        }

        int capacity(){
            int cap=arr.length;
            return cap;
        }
    }
    public static void main(String args[]){
        Stack st=new Stack();
        // System.out.println(st.isempty());
        // st.display();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        // st.pop();
        // st.display();
        // System.out.println(st.size());
        // System.out.println(st.isempty());
        // System.out.println(st.isfull());
        // st.capacity();
    }
}