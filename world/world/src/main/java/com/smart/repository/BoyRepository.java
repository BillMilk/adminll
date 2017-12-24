package com.smart.repository;

import com.smart.entity.Boys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/12/10.
 */
@Repository
public interface BoyRepository extends JpaRepository<Boys,Integer>{
    public Boys findByName(String name);
}
