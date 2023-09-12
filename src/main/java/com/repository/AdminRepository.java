package com.repository;

import com.model.AdministrateurCom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdministrateurCom,Integer> {
}
