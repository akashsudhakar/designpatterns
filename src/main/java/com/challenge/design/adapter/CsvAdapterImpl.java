package com.challenge.design.adapter;

public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormatter;

    public CsvAdapterImpl(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return csvFormatter.formatCsvText(text);
    }
}
