package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Nation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NationJpaRepository extends JpaRepository<Nation, Long> {

    List<Nation> findByNationNameContainingIgnoreCaseOrItatCodeContainingIgnoreCaseOrCityContainingIgnoreCase(String nationName, String itatCode, String city);

}
