import java.util.*;
import java.io.*;
class Get_minimum{
    Stack<Integer>st=new Stack<>();
    Stack<Integer>min=new Stack<>();
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

    public static void main(String args[]){
        Get_minimum o=new Get_minimum();
        o.push(3);
        o.push(4);
        o.push(2);
        o.push(1);
        o.pop();
        System.out.println(o.getMin());
        System.out.println(o.top());
        // o.top();
    }
}
