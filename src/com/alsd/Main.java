package com.alsd;

import org.springframework.beans.factory.BeanFactory;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.instantiate("com.alsd");
        ProductService productService = (ProductService) beanFactory.getBean("productService");
        System.out.println(productService);
        try {
            beanFactory.populateProperties();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(productService.getPromotionService());
    }
}
