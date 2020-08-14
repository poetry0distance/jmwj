package com.example.poetry.okmAilibaba.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * User: wangtao
 * Date: 2020/7/31
 *
 * @author false
 * Description:
 */
public class ReentrantLockThread {

    public static void main(String[] args) {
        ReentrantLock rl = new ReentrantLock();
        try {
            rl.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
