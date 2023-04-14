package com.FitnessApp.external;

import com.FitnessApp.external.model.RapidApiBMIResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import lombok.AllArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@AllArgsConstructor
public class RapidApiClient {

    private final OkHttpClient client;

    public RapidApiBMIResponse getBMI(String weight, String height) throws IOException {

        Request request = new Request.Builder()
                .url(String.format("https://body-mass-index-bmi-calculator.p.rapidapi.com/metric?weight=%s&height=%s",
                        weight, height))
                .get()
                .addHeader("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
                .addHeader("X-RapidAPI-Host", "body-mass-index-bmi-calculator.p.rapidapi.com")
                .build();
        RapidApiBMIResponse rapidApiBMIResponse = null;

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new GsonBuilder().create();
            rapidApiBMIResponse = gson.fromJson(response.body().charStream(), RapidApiBMIResponse.class);
        }

        return rapidApiBMIResponse;
    }
}
