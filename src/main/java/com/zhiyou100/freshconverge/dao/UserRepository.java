package com.zhiyou100.freshconverge.dao;

import com.zhiyou100.freshconverge.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String userName);

    //boolean findUser(String userName);
}
