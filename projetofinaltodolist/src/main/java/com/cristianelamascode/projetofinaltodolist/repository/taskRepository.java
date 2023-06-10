package com.cristianelamascode.projetofinaltodolist.repository;

import com.cristianelamascode.projetofinaltodolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}