package com.ivispl.candidate.info.repository;

import com.ivispl.candidate.info.entity.CandidateInfo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CandidateInfoRepository extends ReactiveCrudRepository<CandidateInfo, Long> {
    Mono<CandidateInfo> findByPanNumber(String panNumber);
}
