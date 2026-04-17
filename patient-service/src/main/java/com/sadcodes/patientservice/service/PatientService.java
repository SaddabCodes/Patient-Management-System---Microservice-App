package com.sadcodes.patientservice.service;

import com.sadcodes.patientservice.model.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PatientService {

    private final PatientRepository patientRepository;
}
