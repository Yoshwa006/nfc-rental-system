package com.example.nfc.rental.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "items") // Changed from "users" to match entity name
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name", nullable = false, length = 100)
    private String itemName;

    @Column(name = "item_price", nullable = false)
    private Long price;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "owner_name", nullable = false, length = 100)
    private String ownerName;

    @Column(name = "phone", nullable = false, length = 15)
    private String phone; // Changed from int to String

    @Column(name = "rental_status", nullable = false)
    private boolean isAvailable;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    // Default Constructor
    public Item() {}

    // Parameterized Constructor
    public Item(String itemName, Long price, String description, String ownerName, String phone, boolean isAvailable, String password) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.ownerName = ownerName;
        this.phone = phone;
        this.isAvailable = isAvailable;
        this.password = password;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString() method for debugging
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", phone='" + phone + '\'' +
                ", isAvailable=" + isAvailable +
                ", password='" + password + '\'' +
                '}';
    }
}
