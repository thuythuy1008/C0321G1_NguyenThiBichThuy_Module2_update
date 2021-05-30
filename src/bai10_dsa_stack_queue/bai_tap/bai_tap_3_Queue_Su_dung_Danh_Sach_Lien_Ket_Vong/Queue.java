package bai10_stack_queue.bai_tap.bai_tap_3_Queue_Su_dung_Danh_Sach_Lien_Ket_Vong;

public class Queue<E> {
    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }

    private Node rear;
    private Node front;

    public Queue() {
    }

    public void enQueue(E data) {
        Node temp = new Node(data);
        if (this.front == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.next = temp;
            this.rear = this.rear.next;
            this.rear.next = this.front;
        }
    }

    public int deQueue() {
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
            this.rear.next = this.front;
        }
        return 0;
    }

    public boolean isEmpty() {
        return this.front == null && this.rear == null;
    }

    public void displayQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        Node temp = this.front;
        while (temp.next != this.front) {
            System.out.print(temp.getData() + "\t");
            temp = temp.next;
        }
        System.out.println(this.rear.getData());
    }
}
