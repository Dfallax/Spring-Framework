package exmple.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tittle;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(Long id, String tittle, Double price, Integer quantity) {
        this.id = id;
        this.tittle = tittle;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
