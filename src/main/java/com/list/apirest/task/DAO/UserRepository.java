package com.list.apirest.task.DAO;

import com.list.apirest.task.Entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<users, Integer> {

}
