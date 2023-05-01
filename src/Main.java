public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // указать вес в КГ
        double height = 1.87; // указать рост в метрах
        int index = 0;
        index = (int) service.calculate(weight, height);
        System.out.println(index);
    }
}
