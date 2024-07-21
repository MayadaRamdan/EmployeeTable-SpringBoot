package com.example.first.repository;

import com.example.first.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<
        Staff , Integer> {




}
