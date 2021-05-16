package com.lmg.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmg.hruser.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	 User findByEmail(String email);
}
