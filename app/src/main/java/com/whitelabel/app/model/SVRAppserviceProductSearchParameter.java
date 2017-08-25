package com.whitelabel.app.model;

import java.io.Serializable;

/**
 * Created by imaginato on 2015/7/13.
 */
public class SVRAppserviceProductSearchParameter implements Serializable {
    public static final int PAGENUM=20;
    private String store_id;
    private int p;
    private int limit;
    private String order;
    private String dir;
    private String category_id;
    private String brand;
    private String model_type;
    private String q;
    private String price;
    private String brandId;
    private String name;
    private String brandName;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SVRAppserviceProductSearchParameter() {
        clear();
    }

    public void clear() {
        p = 1;
        limit = PAGENUM;
        order = null;
        dir = null;
        category_id = null;
        brand = null;
        model_type = null;
        q = null;
        price = null;
        brandId = null;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
}
