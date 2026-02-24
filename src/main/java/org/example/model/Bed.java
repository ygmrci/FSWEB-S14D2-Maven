package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int quilts, int sheets, int height, int pillows) {
        this.style = style;
        this.quilts = quilts;
        this.sheets = sheets;
        this.height = height;
        this.pillows = pillows;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getHeight() {
        return height;
    }

    public String getStyle() {
        return style;
    }
}
