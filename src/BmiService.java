public class BmiService {
    public double calculate (int weight, double height) {
        return weight / Math.pow(height/100,2);
    }
}
