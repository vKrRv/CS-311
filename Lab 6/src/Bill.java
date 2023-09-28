public class Bill {

    public static void main(String[] args){
        Order[] order = new Order[2];
        order[0] = new Order("Rice", 30.0);
        order[1] = new Order("Pasta", 40.0);
        double bill = getBill(order);
        System.out.println("The 1st order is " + order[0].getOrderName() +
                           ",and it's price: " + order[0].getOrderPrice() +
                           "\nThe 1st order is " + order[0].getOrderName() +
                           ",and it's price: " + order[0].getOrderPrice() +
                           "\nNumber of orders: " + order[0].numberOfOrders +
                           ",and the bill will be: " +  bill);
    }
    static double getBill(Order[] order){
        return order[0].getOrderPrice() + order[1].getOrderPrice();}
}
