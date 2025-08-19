//package com.project.user_service.config;
//
//import java.time.Duration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.cache.RedisCacheWriter;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.serializer.RedisSerializationContext;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import com.project.user_service.cache.CustomCacheManger;
//@Configuration
//@EnableCaching
//public class RedisCacheConfig {
//	
//	@Value("")
//    private Integer expireTime;
//
//    @Autowired
//    private RedisCacheWriter redisCacheWriter;
//
//    private RedisConnectionFactory connectionFactory;
//
//    @Bean(name = "getAllUsersManager")  // Using "cacheManager" as the bean name
//    public RedisCacheManager getAllUsersManager() {
//
//        RedisCacheConfiguration redisCacheConfiguration=RedisCacheConfiguration.defaultCacheConfig()
//                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json()))
//                .entryTtl(Duration.ofMinutes(expireTime));
//        return  new CustomCacheManger(redisCacheWriter,redisCacheConfiguration);
//    }
//
//    @Bean(name = "userCacheManager")  // Using "cacheManager" as the bean name
//    public RedisCacheManager userCacheManager() {
//
//        RedisCacheConfiguration redisCacheConfiguration=RedisCacheConfiguration.defaultCacheConfig()
//                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json()))
//                .entryTtl(Duration.ofMinutes(expireTime));
//        return  new CustomCacheManger(redisCacheWriter,redisCacheConfiguration);
//    }
//
//}
