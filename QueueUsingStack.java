package com.codingblocks;
import java.util.Stack;
import java.util.Queue;
public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStack(){
        first=new Stack<>();
        second=new Stack<>();
    }



    public void add(int item){
        first.push(item);
    }

    public int remove()
    {
       while(!first.isEmpty())
       {
           second.push(first.pop());
       }
       int temp=second.pop();
       while(!second.isEmpty())
       {
           first.push(second.pop());
       }
       return temp;
    }

    public int peek()
    {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int temp=second.peek();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return temp;
    }
    public boolean isEmpty()
    {
        return first.isEmpty();
    }
}
