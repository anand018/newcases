package com.covido.newcases.repo;

import com.covido.newcases.entities.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewCaseRepo extends JpaRepository<StateEntity, Integer> {

}
