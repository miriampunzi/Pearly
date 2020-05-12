package es.upm.progui.pearly;

import java.io.Serializable;

public class Card_UNO implements Serializable {

    private int imageIdResource;
    private String name;
    private boolean isNumber;
    private int number;
    private String symbol;
    private String colour;
    private String rule;

    public Card_UNO(int imageIdResource, String name, boolean isNumber, int number, String symbol, String colour, String rule) {
        this.imageIdResource = imageIdResource;
        this.name = name;
        this.isNumber = isNumber;
        this.number = number;
        this.symbol = symbol;
        this.colour = colour;
        this.rule = rule;
    }

    public int getImageIdResource() {
        return imageIdResource;
    }

    public void setImageIdResource(int imageIdResource) {
        this.imageIdResource = imageIdResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNumber() {
        return isNumber;
    }

    public void setNumber(boolean number) {
        isNumber = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}