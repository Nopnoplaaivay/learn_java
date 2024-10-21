package cau4;

class SumThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    // Phương thức tính tổng
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    // Phương thức trả về tổng
    public int getSum() {
        return sum;
    }
}