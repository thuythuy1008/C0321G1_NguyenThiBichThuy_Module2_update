package bai10_stack_queue.bai_tap.bai_tap_3_Queue_Su_dung_Danh_Sach_Lien_Ket_Vong;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println("Hàng đợi ban đầu là: ");
        queue.displayQueue();

        queue.deQueue();
        System.out.println("Hàng đợi sau khi xóa là: ");
        queue.displayQueue();

        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
