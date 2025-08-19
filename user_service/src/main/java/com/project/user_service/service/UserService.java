package com.project.user_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.user_service.cache.UserCacheRedisManagerImpl;
import com.project.user_service.model.Employee;
import com.project.user_service.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private UserCacheRedisManagerImpl userCacheRedisManagerImpl;

	// Get all users
	public List<Employee> getAllUsers() {
		return userRepository.findAll();
	}

	// Get user by ID
	public Optional<Employee> getUserById(Long id) {
		return userRepository.findById(id);
	}

	public Employee createUser(Employee user) {
		return userRepository.save(user);
	}

	// Update user
	public Employee updateUser(Long id, Employee user) {
		if (userRepository.existsById(id)) {
//            user.set(id);
			return userRepository.save(user);
		}
		return null; // return null or throw an exception if not found
	}

	// Delete user by ID
	public boolean deleteUser(Long id) {
		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	//caching
    public List<Employee> getUsers() {
        return userCacheRedisManagerImpl.getUsers((int) 1L);

    }
}
