class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order placement started...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Placing order - Step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Order placed successfully!");
    }
}
class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order delivery started...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Delivery in progress - Step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Order delivered successfully!");
    }
}
class Main {
    public static void main(String[] args) {
        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();
        placement.start();
        delivery.start();
    }
}
