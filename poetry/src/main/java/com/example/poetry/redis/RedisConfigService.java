package com.example.poetry.redis;

import redis.clients.jedis.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/3/31
 * @author false
 * Description:
 */
public class RedisConfigService {

    private static JedisPool pool = null;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        //设置最大连接数
        config.setMaxTotal(200);
        //设置最大空闲
        config.setMaxIdle(8);
        //设置最大等待时间
        config.setMaxWaitMillis(1000*1000);
        // 在borrow一个jedis实例时，是否需要验证，若为true，则所有jedis实例均是可用的
        config.setTestOnBorrow(true);
        pool = new JedisPool(config,"127.0.0.1",6379,3000);
    }
    DistributedLock lock = new DistributedLock(pool);

    int n = 500;
    public void seckill(){
        // 返回锁的value值，供释放锁时候进行判断
        String indentifier = lock.lockWithTimeout("resource", 5000, 1000);
        System.out.println(Thread.currentThread().getName() + "获得了锁");
        System.out.println(--n);
        lock.releaseLock("resource", indentifier);
    }

    public static void main(String[] args) {
        JedisCluster jedisCluster;
        String portAddress = "127.0.0.1:6379,127.0.0.1:6380,127.0.0.1:6381," +
                "127.0.0.1:6382,127.0.0.1:6383,127.0.0.1:6384";
        String[] hostArray = portAddress.split(",");
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        for(String host : hostArray)
        {
            String[] detail = host.split(":");
            nodes.add( new HostAndPort(detail[0] , Integer.parseInt(detail[1])) );
        }
        jedisCluster = new JedisCluster(nodes);
        System.out.println(jedisCluster.get("ee"));

    }
}
