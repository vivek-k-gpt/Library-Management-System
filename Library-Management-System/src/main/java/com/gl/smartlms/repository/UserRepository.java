package com.gl.smartlms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.smartlms.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Long>{

	List<User> findAllByOrderByNameAsc();

	User findByUsername(String username);

	User findByUsernameAndPassword(String username, String password);

}
