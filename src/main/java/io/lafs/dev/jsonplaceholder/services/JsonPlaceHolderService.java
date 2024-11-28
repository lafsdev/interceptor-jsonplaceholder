package io.lafs.dev.jsonplaceholder.services;

import io.lafs.dev.jsonplaceholder.integration.JsonPlaceHolderClient;
import org.springframework.stereotype.Service;

@Service
public class JsonPlaceHolderService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public JsonPlaceHolderService(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public String consumeApi() {
        return jsonPlaceHolderClient.getPosts();
    }
}
