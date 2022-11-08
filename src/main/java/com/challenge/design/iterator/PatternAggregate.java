package com.challenge.design.iterator;

public interface PatternAggregate {
    void addPattern(DesignPattern designPattern);

    void removePattern(DesignPattern designPattern);

    PatternIterator getPatternIterator();
}
