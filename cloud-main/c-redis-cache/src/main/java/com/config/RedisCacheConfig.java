package com.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.jcache.config.JCacheConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

/**
 * User: wangtao
 * Date: 2020/8/20
 *
 * @author false
 * Description:
 */
@Configuration
@EnableCaching
public class RedisCacheConfig extends JCacheConfigurerSupport {


    /**
     * 自定义key生成
     * @return
     */
    public KeyGenerator cacheKeyGenerator() {
        return (target, method, params) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(target.getClass().getName());
            sb.append(method.getName());
            return sb.toString();
        };
    }
    /**
     * redis 缓存设置，基于spring-boot 2.x以上版本
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
            RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                    .entryTtl(Duration.ofHours(1));   /*设置缓存有效期一小时*/
            return RedisCacheManager
                    .builder(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory))
                    .cacheDefaults(redisCacheConfiguration).build();
    }
}
