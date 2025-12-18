public class Main {
    public static void main(String[] args){
        MainDish dish=new MainDish("kebap" ,500,true);
        Dessert des=new Dessert("sütlaç",400,true);
        Drink drink=new Drink("fuse tea mango",50, true);
        dish.describe();
        des.describe();
        drink.describe();
    }
}