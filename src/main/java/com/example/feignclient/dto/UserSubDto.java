package com.example.feignclient.dto;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-08        koiw1       최초 생성
 */
public class UserSubDto {
    private String generation ;

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "UserSubDto{" +
                "generation='" + generation + '\'' +
                ", price='" + price + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    private String price ;
    private String capacity ;
}
