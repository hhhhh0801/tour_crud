package com.crud.bean;

import java.math.BigDecimal;

public class Spot {
    private Integer id;

    private String name;
    private BigDecimal price;
    private String pic_path;
    private String opentime;
    private String introduce;
    private String city;
    private String address;
    private String label;

    public Spot() {
    }

    public Spot(String name, BigDecimal price, String pic_path, String opentime, String introduce, String city, String address, String label) {
        this.name = name;
        this.price = price;
        this.pic_path = pic_path;
        this.opentime = opentime;
        this.introduce = introduce;
        this.city = city;
        this.address = address;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
