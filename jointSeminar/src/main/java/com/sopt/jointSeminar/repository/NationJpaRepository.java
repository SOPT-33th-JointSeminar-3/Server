package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Nation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NationJpaRepository extends JpaRepository<Nation, Long> {

    List<Nation> findByNationNameContainingIgnoreCaseOrItatCodeContainingIgnoreCaseOrCityContainingIgnoreCase(String nationName, String itatCode, String city);

}
