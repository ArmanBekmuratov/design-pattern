package com.arman.basepatterns.creational.buider;

public class House {
    private String name;
    private Material material;
    private int cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", cost=" + cost +
                '}';
    }
}
