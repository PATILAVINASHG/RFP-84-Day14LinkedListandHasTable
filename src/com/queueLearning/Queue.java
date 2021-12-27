package com.queueLearning;



public class Queue {
       
        LinkedList list = new LinkedList();
       
        public void enqueue(Object data) {
                list.addFirst(data);
        }
       
        public void dequeue()
        {
                list.deleteLast();
        }
       
        public void getElements()
        {
                list.print();
        }

}
