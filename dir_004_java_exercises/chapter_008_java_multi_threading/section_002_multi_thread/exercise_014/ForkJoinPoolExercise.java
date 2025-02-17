import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolExercise {

    public static void main(String[] args) {
        int[] array = {
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
        };

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        int sum = forkJoinPool.invoke(new SumTask(array, 0, array.length));

        System.out.println("Sum: " + sum);
    }

    static class SumTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start;
        private final int end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= 2) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                int mid = start + (end - start) / 2;

                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);

                invokeAll(leftTask, rightTask);

                return leftTask.join() + rightTask.join();
            }
        }
    }
}
