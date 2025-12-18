public class Fruit {
    private String name;
    private double calories;

    public Fruit(String name,double calories) {
        this.name = name;
        this.calories=calories;
    }
    public String getInfo(){
        return name + " - " + calories + " kcal ";
    }
    public void describe(){
        System.out.println("this is a fruit item : " + getInfo());
    }
}
