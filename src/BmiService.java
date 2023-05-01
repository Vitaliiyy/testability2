public class BmiService {

    public double calculate(double weight, double height) {
        double result; // про то чтобы написать в IF два условия нашел в инете про ||
        if (weight > 0 || height > 0)  {
            result = weight / (height * height);
        } else {
            result = 0;
        }

        return result;
    }
}

