public class TestCalculator {
    public static void main(String[] args){
        Calculator cal=new Calculator();
        System.out.println(cal.add(5,10));
        System.out.println(cal.add(5.2,7.8));
        System.out.println(cal.add(3,4,5));
    }
}
