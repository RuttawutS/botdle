
package com.spj.botdle.repository;

import com.spj.botdle.entity.LkSymbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LkSymbolRepository extends JpaRepository<LkSymbol, Long> {



}
