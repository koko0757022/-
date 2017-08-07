package linkedlistqueue;

import linkedlist.ListNode;
import linkedlist.MyLinkedList;

interface Queue{
   void enQueue(String data);
   String deQueue();
   String peek();
   void printAll();
}

public class MyListQueue extends MyLinkedList implements Queue{
   
   private ListNode front;
   private ListNode rear;
   
   public MyListQueue() {
      front = null;
      rear = null;
   }

   @Override
   public void enQueue(String data) {
      ListNode newNode;
      if(isEmpty()) {  //MyLinkedList의 함수사용
         newNode = addElement(data);
         front = newNode;
         rear = newNode;
      }
      else {
         newNode = addElement(data); //리스트를 계속 이어준다.
         rear = newNode;
      }
   }

   @Override
   public String deQueue() {
      String data;
      if(isEmpty()) {
         System.out.println("queue is empty");
         return null;
      }else {
         data = front.getData();
         front = front.next;
         if(front == null){
            rear = null;
         }
      }
      return data;
   }

   @Override
   public String peek() {
      if(isEmpty()) {
         System.out.println("queue is empty");
         return null;
      }
      return front.getData();
   }
   
   public void printAll() {
      if(isEmpty()) {
         System.out.println("queue is empty");
      }
      ListNode temp = front;
      while(temp != null) {
         System.out.print(temp.getData() + " ");
         temp = temp.next;
      }
   }
}