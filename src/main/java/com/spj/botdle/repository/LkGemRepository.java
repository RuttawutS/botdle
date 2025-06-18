package com.spj.botdle.repository;

import com.spj.botdle.entity.LkGem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LkGemRepository extends JpaRepository<LkGem, Long> {



}
