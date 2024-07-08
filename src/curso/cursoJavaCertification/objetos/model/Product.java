package curso.cursoJavaCertification.objetos.model;

public class Product {
    double price;
    
    public Product(double price) {
        this.price = price;
    }

    public Product() {

    }
    
    public void update(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }   
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}
