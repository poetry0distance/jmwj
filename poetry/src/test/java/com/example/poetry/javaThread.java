package com.example.poetry;

import com.example.poetry.util.NewThread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/4/18
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class javaThread extends Thread{

    /**
     *  静态方法为线程安全   synchronized 关键字 加lock锁 线程安全 单一synchronized 非线程安全
     */
    private int threadNo;
      private String lock;
      public javaThread(int threadNo) {
          this.threadNo = threadNo;
      }
      public static void main(String[] args) throws Exception {
          for (int i = 1; i < 10; i++) {
              new javaThread(i).start();
//              Thread.sleep(1);
          }
      }
      public static synchronized void abc(int threadNo) {
          for (int i = 1; i < 100; i++) {
              System.out.println("No." + threadNo + ":" + i);
          }
      }
      public void run() {
          abc(threadNo);
      }

//    private int threadNo;
//    private String lock;
//    public javaThread(int threadNo, String lock) {
//        this.threadNo = threadNo;
//        this.lock = lock;
//    }
//    public static void main(String[] args) throws Exception {
//        String lock = new String("lock");
//        for (int i = 1; i < 10; i++) {
//            new javaThread(i, lock).start();
////            Thread.sleep(1);
//        }
//    }
//    public void run() {
//        synchronized (lock) {
//            for (int i = 1; i < 100; i++) {
//                System.out.println("No." + threadNo + ":" + i);
//            }
//        }
//    }

//    private int threadNo;
//    public javaThread(int threadNo) {
//        this.threadNo = threadNo;
//    }
//    public static void main(String[] args) throws Exception {
//        for (int i = 1; i < 10; i++) {
//            new javaThread(i).start();
//            Thread.sleep(1);
//        }
//    }
//
//    @Override
//    public synchronized void run() {
//        for (int i = 1; i < 100; i++) {
//            System.out.println("No." + threadNo + ":" + i);
//        }
//    }
//    public static void main(String [] args){




//        ThreadDemo threadDemo1 = new ThreadDemo("thread_001");
//        threadDemo1.start();
//        ThreadDemo threadDemo2 = new ThreadDemo("thread_002");
//        threadDemo2.start();
//       NewThread n =  new NewThread(); // 创建一个新线程
//        try {
//            for(int i = 5; i > 0; i--) {
//                System.out.println("Main Thread: " + i);
//                Thread.sleep(100);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }
//        System.out.println("Main thread exiting.");
//    }
}
