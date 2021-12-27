package com.queueLearning;


public class MainRunner {

        public static void main(String[] args) {
                Queue queue = new Queue();
                queue.enqueue(56);
                queue.getElements();
                queue.enqueue(30);
                queue.getElements();
                queue.enqueue(70);
                queue.getElements();
                queue.dequeue();
                queue.getElements();
                queue.dequeue();
                queue.getElements();
                queue.dequeue();
                queue.getElements();
                Stack stack = new Stack();
                stack.push(70);
                stack.showElements();
                stack.push(30);
                stack.showElements();
                stack.push(56);
                stack.showElements();
                stack.pop();
                stack.showElements();
                stack.pop();
                stack.showElements();
                stack.pop();
                stack.showElements();
                
        }
        

}