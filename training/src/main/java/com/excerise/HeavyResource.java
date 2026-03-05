package com.excerise;

import org.springframework.stereotype.Component;

@Component
public class HeavyResource {

    public HeavyResource(){
        System.out.println("HeavyResource created...");
    }
}
