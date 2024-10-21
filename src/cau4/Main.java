package cau4;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 1};
            int mid = numbers.length / 2;

            SumThread sumFirstHalf = new SumThread(numbers, 0, mid);
            SumThread sumSecondHalf = new SumThread(numbers, mid, numbers.length);

            sumFirstHalf.start();
            sumSecondHalf.start();

            sumFirstHalf.join();
            sumSecondHalf.join();

            System.out.println("Tổng của nửa đầu là: " + sumFirstHalf.getSum());
            System.out.println("Tổng của nửa sau là: " + sumSecondHalf.getSum());
            int totalSum = sumFirstHalf.getSum() + sumSecondHalf.getSum();
            System.out.println("Tổng của mảng là: " + totalSum);
        }
}
