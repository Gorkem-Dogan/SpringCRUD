package Northwind.com.Entity.Concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "Categories")
public class Category {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "categoryid")
int id;
    @Column(name="categoryname")
String categoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="description")
String description;

}
