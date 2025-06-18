package com.spj.botdle.repository;

import com.spj.botdle.entity.LkPack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LkPackRepository extends JpaRepository<LkPack, Long> {



}
