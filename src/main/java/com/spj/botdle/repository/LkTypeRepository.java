

package com.spj.botdle.repository;

import com.spj.botdle.entity.LkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LkTypeRepository extends JpaRepository<LkType, Long> {



}
