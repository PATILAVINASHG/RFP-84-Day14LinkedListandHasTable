package com.queueLearning;

public class LinkedList {
        Node head;

        public class Node {
                Object data;
                Node next;

                Node(Object data) {
                        this.data = data;
                }

        }

        public boolean addLast(Object data) {
                Node newNode = new Node(data);

                if (head == null) {
                        head = newNode;
                        return true;
                }

                Node temp = head;
                while (temp.next != null) {

                        temp = temp.next;
                }

                temp.next = newNode;
               

                return true;
        }

        public boolean addFirst(Object data) {

                Node newNode = new Node(data);
                if (head == null) {
                        head = newNode;
                        return true;
                }

                Node temp = head;
                newNode.next = temp;
                head = newNode;

                return true;
        }

        public boolean deleteFirst()
        {
        	Node temp=head;  
        	head=temp.next;
             return true;
        }
       
        public boolean deleteLast() {
               
                if(head==null)
                        return false;
                if(head.next == null)
                {
                        head=null;
                        return true;
                }
               
                Node temp=head;
               
                while(temp.next.next!=null)
                {
                        temp=temp.next;
                }
               
                temp.next=null;
               
                return false;
               
        }
        public void print() {

                if (head == null) {
                        System.out.println("No elements to show...");
                        return;
                }

                Node temp = head;
                if (head.next == null) {
                        System.out.println(head.data);
                        return;
                }
                while (temp != null) {

                        if (temp.next != null)
                                System.out.print(temp.data + " ===> ");
                        else
                                System.out.println(temp.data);

                        temp = temp.next;
                }
        }

}