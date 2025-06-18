package com.spj.botdle.repository;

import com.spj.botdle.entity.LkCardColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LkCardColorRepository extends JpaRepository<LkCardColor, Long> {



}
