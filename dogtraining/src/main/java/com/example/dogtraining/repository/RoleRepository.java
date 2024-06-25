package com.example.dogtraining.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dogtraining.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
