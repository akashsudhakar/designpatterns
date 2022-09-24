package com.challenge.design.adapter;

public class CsvFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        return text.replace(".", ",");
    }
}
