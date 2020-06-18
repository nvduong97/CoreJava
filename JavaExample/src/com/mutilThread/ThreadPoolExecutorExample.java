package com.mutilThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        int queueCapacity = 100;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, // Số corePoolSize
                maximumPoolSize, // số maximumPoolSize
                10, // thời gian một thread được sống nếu không làm gì
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(queueCapacity)); // Blocking queue để cho request đợi
        // 1000 request đến dồn dập, liền 1 phát, không nghỉ
        for (int i = 0; i < 1000; i++) {
            executor.execute(new RequestHandler("request-" + i));
            Thread.sleep(50);
        }
        executor.shutdown(); // Không cho threadpool nhận thêm nhiệm vụ nào nữa

        while (!executor.isTerminated()) {
            // Chờ xử lý hết các request còn chờ trong Queue ...
        }
    }
}
