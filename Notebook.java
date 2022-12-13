package org.example;

public class Notebook {
    private String name;
    private String ram;
    private String diagonal;
    private String color;

    @Override
    public String toString() {
        return "Notebook{" + "name=" + name + ", RAM=" + ram + ", diagonal=" + diagonal + ", color="
                + color + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
