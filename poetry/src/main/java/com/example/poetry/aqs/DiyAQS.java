package com.example.poetry.aqs;

import lombok.extern.slf4j.Slf4j;

/**
 * User: wasu
 * Date: 2020/7/7
 *
 * @author false
 * Description:
 */
@Slf4j
@SuppressWarnings("all")
public class DiyAQS {

    private volatile int num = 5;

    public static final int user_num = 100;

    private AQSLock lock = new AQSLock();

    public void buy() {
        lock.lock();
        if (num > 0) {
            try {
                // 模拟购买的耗时
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("购买成功，剩余库存为：{}", this.num);
            num--;
        }
        else {
            log.info("购买失败，库存不足，剩余库存为：{}", this.num);
        }
        lock.unlock();
    }

    public static void main(String[] args) {
        DiyAQS diyAQS = new DiyAQS();
        for (int i=0;i<user_num;i++){
            Thread thread = new Thread(() -> diyAQS.buy(),String.format("第%d位顾客的线程", i + 1));
            thread.start();
        }
    }

}
