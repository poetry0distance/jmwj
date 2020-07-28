package com.example.poetry;

import com.example.poetry.redis.RedisConfigService;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/3/31
 * @author false
 * Description:
 */
public class RedisTest extends Thread{

    private RedisConfigService service;

    public RedisTest(RedisConfigService service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.seckill();
    }

    public static void main(String[] args) {
        RedisConfigService service = new RedisConfigService();
        for (int i = 0; i < 50; i++) {
            RedisTest threadA = new RedisTest(service);
            threadA.start();
        }
    }
}
