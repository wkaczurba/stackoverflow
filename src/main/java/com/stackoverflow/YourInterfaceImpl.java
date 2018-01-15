package com.stackoverflow;

import org.springframework.stereotype.Component;

@Component
class YourInterfaceImpl implements YourInterface {

    public boolean func() {
        System.out.println("func called..."); // Always use logger in real world...
        return true;
    }
}
