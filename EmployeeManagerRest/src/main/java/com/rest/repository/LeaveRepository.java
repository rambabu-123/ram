package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer> {

}
