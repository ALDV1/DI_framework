package com.alsd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    private PromotionService promotionService;

    public ProductService(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    public ProductService(){

    }

    public PromotionService getPromotionService() {
        return this.promotionService;
    }

    public void setPromotionService(PromotionService promotionService){
        this.promotionService = promotionService;
    }
}
