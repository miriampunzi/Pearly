package es.upm.progui.pearly.entities;

public class Game {

    private String name;
    private int imageIdResource;

    public Game(String name, int imageIdResource) {
        this.name = name;
        this.imageIdResource = imageIdResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageIdResource() {
        return imageIdResource;
    }

    public void setImageIdResource(int imageIdResource) {
        this.imageIdResource = imageIdResource;
    }
}
