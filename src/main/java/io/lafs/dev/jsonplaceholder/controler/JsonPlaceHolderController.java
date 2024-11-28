package io.lafs.dev.jsonplaceholder.controler;

import io.lafs.dev.jsonplaceholder.services.JsonPlaceHolderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonPlaceHolderController {

    private final JsonPlaceHolderService jsonPlaceHolderService;

    public JsonPlaceHolderController(JsonPlaceHolderService jsonPlaceHolderService) {
        this.jsonPlaceHolderService = jsonPlaceHolderService;
    }

    @GetMapping("/posts")
    public String consumeApi() {
        return jsonPlaceHolderService.consumeApi();
    }
}
