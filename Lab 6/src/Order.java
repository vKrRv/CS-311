public class Order {
    public int numberOfOrders = 0;
    private String orderName = "";
    private double orderPrice = 0.0;

    Order(String newOrderName, double newOrderPrice){
        numberOfOrders++;
        orderName = newOrderName;
        orderPrice = newOrderPrice;
    }

    public String getOrderName(){ return orderName;}
    public double getOrderPrice(){ return orderPrice;}
}
