public class MyCartProduct {
    Product p;
    int quantity;
    float total_price;

    private static float total_value = 0.0f;
    public static int gst = 18;
    private static float gstVal;

    public MyCartProduct(Product p, int quantity) {
        this.p = p;
        this.quantity = quantity;
        this.total_price = (this.p.price * this.quantity);
        setTotalAmount(total_price);
    }

    public void printMyCartProduct(MyCartProduct m) {
        System.out.println(m.p.id + "-----" + m.p.name + "-----" + m.p.price +"     " + m.quantity + "-----" + m.total_price);
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
        this.total_price = this.p.price * this.quantity;
        setTotalAmount(total_price);
    }

    //getter
    public static float getTotalAmount(){
        return total_value;
    }
    public static float getGstVal(){
        return gstVal;
    }




    //setter
    public void setTotalAmount(float addedPrice) {
        total_value = total_value + addedPrice;
        gstVal = (gst*total_value)/100;
    }

}
