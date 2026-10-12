import java.util.Scanner;
class Average {
    double average;
    double[] numbers = new double[10];

    void calculate() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        this.average = sum / 10;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > this.average) {
                count++;
            }
        }

        System.out.println("Average = " + this.average);
        System.out.println("Numbers above average = " + count);
        sc.close();
    }
}
public class Q11Average {
    public static void main(String[] args) {
        Average obj = new Average();
        obj.calculate();
    }
}
