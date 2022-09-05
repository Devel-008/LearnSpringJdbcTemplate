package com.practice.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UseInterfaceForInitDestroy implements InitializingBean, DisposableBean {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public UseInterfaceForInitDestroy(){
        super();
    }

    @Override
    public String toString() {
        return "UseInterfaceForInitDestroy{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("INITIALIZING");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DESTRUCTION");
    }
}

