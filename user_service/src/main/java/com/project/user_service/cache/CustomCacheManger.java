//package com.project.user_service.cache;
//
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.cache.RedisCacheWriter;
//
//public class CustomCacheManger extends RedisCacheManager {
//
//    public CustomCacheManger(RedisCacheWriter cacheWriter, RedisCacheConfiguration defaultCacheConfiguration) {
//        super(cacheWriter, defaultCacheConfiguration);
//        RedisCacheManager.builder(cacheWriter).cacheDefaults(defaultCacheConfiguration).build();
//    }
//
//}
