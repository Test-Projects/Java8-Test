package nao.cycledev.java8test.model;

public class Apple{

    private int id;
    private String name;
    private int weight;
    private String color;

    public Apple(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Apple(int id, String name, int weight, String color) {
        this(id, name, weight);
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple: " + getId() + "; " + getName() + "; " + getWeight() + "; " + getColor();
    }

    public static boolean isAppleGreen(Apple apple){
        return "green".equals(apple.getColor());
    }
}
