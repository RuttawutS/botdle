package com.spj.botdle.repository;

import com.spj.botdle.entity.LkCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LkCostRepository extends JpaRepository<LkCost, Long> {



}
