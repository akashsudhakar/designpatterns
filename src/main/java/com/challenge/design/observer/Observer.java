package com.challenge.design.observer;

import java.math.BigDecimal;

public interface Observer {
    void update(Observer observer, String productName, BigDecimal bidAmount);
}