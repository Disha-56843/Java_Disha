package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User,Long> {

	 User findByUsername(String username);
	
}
