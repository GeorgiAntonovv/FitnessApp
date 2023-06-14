package com.FitnessApp.calculator.service;

import com.FitnessApp.calculator.model.bmi.RapidApiBMIResponse;
import com.FitnessApp.calculator.model.macros.RapidApiMacrosResponse;
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
public class CalculatorService {

    private final OkHttpClient client;

    public RapidApiBMIResponse getBMI(String age, String weight, String height) throws IOException {

        Request request = new Request.Builder()
                .url(String.format("https://fitness-calculator.p.rapidapi.com/bmi?age=%s&weight=%s&height=%s", age, weight, height))
                .get()
                .addHeader("X-RapidAPI-Key", "e6fd97bf6emsh8419606b9e5f71ap1f1af9jsnb726b28bbcce")
                .addHeader("X-RapidAPI-Host", "fitness-calculator.p.rapidapi.com")
                .build();
        RapidApiBMIResponse rapidApiBMIResponse = null;

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder().create();
            rapidApiBMIResponse = gson.fromJson(response.body().charStream(), RapidApiBMIResponse.class);
        }

        return rapidApiBMIResponse;
    }

    public RapidApiMacrosResponse getMacros(String age, String gender, String height, String weight,
            String activityLevel, String goal) throws IOException {

        Request request = new Request.Builder()
                .url(String.format("https://fitness-calculator.p.rapidapi.com/"
                        + "macrocalculator?age=%s&gender=%s&height=%s&weight=%s&activitylevel=%s&goal=%s",
                        age, gender, height, weight, activityLevel, goal))
                .get()
                .addHeader("X-RapidAPI-Key", "e6fd97bf6emsh8419606b9e5f71ap1f1af9jsnb726b28bbcce")
                .addHeader("X-RapidAPI-Host", "fitness-calculator.p.rapidapi.com")
                .build();
        RapidApiMacrosResponse rapidApiMacrosResponse = null;

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder().create();
            rapidApiMacrosResponse = gson.fromJson(response.body().charStream(), RapidApiMacrosResponse.class);
        }
        System.out.println(rapidApiMacrosResponse.getData());
        return rapidApiMacrosResponse;
    }
}
