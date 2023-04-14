package com.FitnessApp.service;

import com.FitnessApp.external.RapidApiClient;
import com.FitnessApp.external.model.RapidApiBMIResponse;
import java.io.IOException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FitnessService {

    private final RapidApiClient client;

    public RapidApiBMIResponse getBMI(String weight, String height) throws IOException {

        return client.getBMI(weight, height);
    }
}
