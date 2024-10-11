package com.alura.calculo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    private String apiKey = "4b75d43fde199c9a0eaab8ad";
    private String base = "";
    private String target = "";

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getConsulta() throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/"+this.apiKey+"/pair/"+this.base+"/"+this.target;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }


}
