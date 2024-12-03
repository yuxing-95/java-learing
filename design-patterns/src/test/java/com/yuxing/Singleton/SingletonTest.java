package com.yuxing.Singleton;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * .
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class SingletonTest {
    @Test
    public void testConcurrent() throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                20,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10000)
        );

        // 提交100个任务到线程池
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> System.out.println(Thread.currentThread().getName() + ": " + SingletonLazy.getInstance()));
        }

        // 关闭线程池
        executor.shutdown();
        try {
            // 等待所有任务完成
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
