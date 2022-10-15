package com.example.image_upload;

import org.springframework.context.annotation.Profile;

@Profile("local")
public class DummySSOPostActionImpl implements SSoPostAction{
    @Override
    public String action() {
        return null;
    }
}
