package com.dog.resue.dao;

import com.dog.resue.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DodRepository extends JpaRepository<Dog,Long> {
}
