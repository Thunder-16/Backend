package com.village.soonyee.repository;

import com.village.soonyee.domain.Posting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostingRepository extends JpaRepository<Posting,Long> {
}
