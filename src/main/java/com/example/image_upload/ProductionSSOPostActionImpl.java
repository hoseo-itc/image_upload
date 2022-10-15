package com.example.image_upload;

import org.springframework.context.annotation.Profile;

@Profile("production")
public class ProductionSSOPostActionImpl implements SSoPostAction{
    @Override
    public String action() {
        return null;
    }
}
