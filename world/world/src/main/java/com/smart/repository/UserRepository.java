package com.smart.repository;

import com.smart.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by admin on 2017/12/2.
 */
@Repository
public interface UserRepository extends JpaRepository<Girl,Integer> {
    public Girl findByName(String name);
}
