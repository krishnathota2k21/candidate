package com.ivispl.candidate.info.service;

import com.ivispl.candidate.info.entity.CandidateInfo;
import com.ivispl.candidate.info.repository.CandidateInfoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Locale;

@Service
public class CandidateInfoService {
    private final CandidateInfoRepository candidateInfoRepository;

    public CandidateInfoService(CandidateInfoRepository candidateInfoRepository) {
        this.candidateInfoRepository = candidateInfoRepository;
    }

    public Mono<CandidateInfo> getCandidateGeneralInfoByPan(String panNumber) {
        return candidateInfoRepository.findByPanNumber(panNumber);
    }

    public Mono<CandidateInfo> saveCandidateDetails(CandidateInfo candidateInfo) {
        candidateInfo.setPanNumber(candidateInfo.getPanNumber().toUpperCase(Locale.ROOT));
        return candidateInfoRepository.save(candidateInfo);
    }
}
