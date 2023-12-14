import java.util.ArrayList;

public class MyMathOperation<T extends Number> {
    public double calculateStandardDeviation(ArrayList<T> a) {
        int N = a.size();
        if (N <= 0) {
            throw new IllegalArgumentException("Mảng rỗng");
        }

        double sum = 0;
        double mean = calculateMean(a);

        for (T element : a) {
            double value = element.doubleValue();
            sum += Math.pow(value - mean, 2);
        }

        double var = sum / N;
        return Math.sqrt(var);
    }

    private double calculateMean(ArrayList<T> a) {
        double sum = 0;
        for (T element : a) {
            sum += element.doubleValue();
        }
        return sum / a.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(4);
        a.add(5);

        MyMathOperation<Integer> inVal = new MyMathOperation<>();
        double intResult = inVal.calculateStandardDeviation(a);
        System.out.println("Độ lệch chuẩn của Integer List: " + intResult);

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(3.0);
        doubleList.add(3.5);
        doubleList.add(4.0);
        doubleList.add(4.5);

        MyMathOperation<Double> doubleVal = new MyMathOperation<>();
        double doubleResult = doubleVal.calculateStandardDeviation(doubleList);
        System.out.println("Độ lệch chuẩn của Double List: " + doubleResult);
    }
}