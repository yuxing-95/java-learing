package com.yuxing.future;

import java.util.concurrent.CompletableFuture;

/**
 * .
 *
 * @author : HeYuxing
 * @version : 1.0 2024/8/5
 * @since : 1.0
 **/
public class CompletableFutureExample {
    //异步地执行一个供应商任务，返回一个 CompletableFuture 对象。
    public void supplyAsyncExample() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("运行supplyAsync方法");
            return "supply";
        });
        future.thenAccept((result) -> System.out.println(result));
    }
    //runAsync：异步地执行一个没有返回值的任务。
    public void runAsyncExample() {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("执行runAsync方法");
        });
        future.join();
    }
    //thenApply：在一个 CompletableFuture 完成后对其结果进行处理，并返回一个新的 CompletableFuture。
    public void thenApplyExample() {
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> 42)
                .thenApply(result -> result * 2);
        integerCompletableFuture.thenAccept((r) -> System.out.println("result: " + r));
    }
    //thenCompose：在一个 CompletableFuture 完成后使用其结果执行另一个异步任务。
    public void thenComposeExample() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result + ", World!"));

        future.thenAccept(result -> System.out.println(result)); // 输出: Hello, World!
    }
    //thenCombine：将两个独立的 CompletableFuture 组合成一个新的 CompletableFuture，并对它们的结果进行处理。
    public void thenCombineExample() {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 42);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 58);

        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, Integer::sum);

        combinedFuture.thenAccept(result -> System.out.println("Sum: " + result)); // 输出: Sum: 100
    }
    public static void main(String[] args) throws InterruptedException {
        CompletableFutureExample example = new CompletableFutureExample();
        example.supplyAsyncExample();
        example.runAsyncExample();
        example.thenApplyExample();
        example.thenComposeExample();
        example.thenCombineExample();
        Thread.sleep(2000);
    }
}
