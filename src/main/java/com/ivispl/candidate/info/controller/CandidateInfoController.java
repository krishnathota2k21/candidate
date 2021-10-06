package com.ivispl.candidate.info.controller;

import com.ivispl.candidate.info.entity.CandidateInfo;
import com.ivispl.candidate.info.service.CandidateInfoService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Locale;

@RestController
@RequestMapping("/candidate")
@Api
public class CandidateInfoController {
    private final CandidateInfoService candidateInfoService;


    public CandidateInfoController(CandidateInfoService candidateInfoService) {
        this.candidateInfoService = candidateInfoService;
    }

    @GetMapping
    public Mono<CandidateInfo> getCandidateGeneralInfo(@RequestParam String panNumber) {
        return candidateInfoService.getCandidateGeneralInfoByPan(panNumber.toUpperCase(Locale.ROOT));
    }

    @PostMapping
    public Mono<CandidateInfo> persistCandidateDetails(@RequestBody CandidateInfo candidateInfo) {
        return candidateInfoService.saveCandidateDetails(candidateInfo);
    }

}
