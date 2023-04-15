package com.FitnessApp.service;

import com.FitnessApp.external.model.RapidApiBMIResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import lombok.AllArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FitnessService {

    private final OkHttpClient client;

    public RapidApiBMIResponse getBMI(String weight, String height) throws IOException {

        Request request = new Request.Builder()
                .url(String.format("https://body-mass-index-bmi-calculator.p.rapidapi.com/metric?weight=%s&height=%s",
                        weight, height))
                .addHeader("X-RapidAPI-Key", "e6fd97bf6emsh8419606b9e5f71ap1f1af9jsnb726b28bbcce")
                .addHeader("X-RapidAPI-Host", "body-mass-index-bmi-calculator.p.rapidapi.com")
                .get()
                .build();
        RapidApiBMIResponse rapidApiBMIResponse = null;

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder().create();
            rapidApiBMIResponse = gson.fromJson(response.body().charStream(), RapidApiBMIResponse.class);
            System.out.println("Response body:" + response.body().string());
        }
        System.out.println("My result: " + rapidApiBMIResponse.getBmi());

        return rapidApiBMIResponse;
    }
}
