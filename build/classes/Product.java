public class Product {

    private String name;
    private double price;
    private int stock;

    

    public double getPrice() {
        return price;
    }

    

    public Product(String name,int stock, double price) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public boolean hasStock(int s){
        if (s <= stock){
            return true;
        }
        return false;
        
        
    }
    public double sell(int n) {
        
        return stock-=n ; // a dummy return value - which you will change
    }

    public void restock(int n) {
        stock += n;
    }

    @Override
    public String toString() {
        return stock + " " + name + " at $" + price;
    }
}
