package com.queueLearning;

public class Stack {
       
        LinkedList list= new LinkedList();
        public void push(Object data)
        {
                list.addLast(data);
        }
       
        public void pop()
        {
                list.deleteFirst();
        }
       
        public void showElements()
        {
                list.print();
        }
       

}

