package io.lafs.dev.jsonplaceholder.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "JsonPlaceHolderApi", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {

    @GetMapping("/posts")
    String getPosts();
}
