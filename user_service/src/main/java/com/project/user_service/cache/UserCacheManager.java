package com.project.user_service.cache;

import java.util.List;

import com.project.user_service.model.Employee;

public interface UserCacheManager {
	List<Employee> getUsers(int id);

}
