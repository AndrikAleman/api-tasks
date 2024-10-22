package com.list.apirest.task.DAO;


import com.list.apirest.task.tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<tasks, Integer> {

}
