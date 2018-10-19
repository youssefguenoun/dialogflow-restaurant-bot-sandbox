package com.google.pso.dialogflowwebhookdemo.web.rest;

import com.google.pso.dialogflowwebhookdemo.model.request.WebhookRequest;
import com.google.pso.dialogflowwebhookdemo.model.response.WebhookResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebhookRestController {



    @PostMapping
    public WebhookResponse handleAction(@RequestBody WebhookRequest request) {

        log.info("Passage dans le webhook !!");

        String location = (String) request.getQueryResult().getParameters().get("location");
        String cuisine = (String) request.getQueryResult().getParameters().get("cuisine");
        String intent = request.getQueryResult().getIntent().getName();


        WebhookResponse response = new WebhookResponse();
        response.setFulfillmentText("Backend service response : "+
                prepareResponse(intent, location, cuisine) +
                request.getQueryResult().getFulfillmentText());

        return response;

    }

    private String prepareResponse(String intent, String location, String cuisine) {
        return " I found Intent: " + intent + "| with parameters: location=" + location + " cuisine=" + cuisine + " .";
    }
    
}