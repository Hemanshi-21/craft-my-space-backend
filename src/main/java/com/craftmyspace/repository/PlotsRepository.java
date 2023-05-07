package com.craftmyspace.repository;

import com.craftmyspace.model.Plots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlotsRepository extends JpaRepository<Plots, Long> {

    List<Plots> findBySizeAndIsDeleted(Integer size, Integer isDeleted);
}
