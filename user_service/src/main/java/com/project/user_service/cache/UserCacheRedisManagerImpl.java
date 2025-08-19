package com.project.user_service.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.project.user_service.model.Employee;
import com.project.user_service.repositories.UserRepository;
@Service
public class UserCacheRedisManagerImpl implements UserCacheManager{
	
	@Autowired
    private UserRepository userRepo;

//    @Autowired
//    private RedisTemplate<String, Employee> redisTemplate;  // Inject RedisTemplate
    @Override
    @Cacheable(value = "employees",  key = "#id")
    public List<Employee> getUsers(int id) {
        return userRepo.findAll();
    }

}
