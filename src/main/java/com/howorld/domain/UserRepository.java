package com.howorld.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {//dao database 접근 최근 Repository로 많이 씀
	//<어떤클래스의 Repository, 클래스의 id타입>

}
