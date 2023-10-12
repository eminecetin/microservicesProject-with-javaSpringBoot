package com.microservice.openai.dto;

import com.microservice.openai.data.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatRequest {
    private String model; //gpt version
    private List<Message> messages; //interface

    public ChatRequest(String model, String prompt){
        this.model=model;
        this.messages=new ArrayList<>(); //bu ise concrate hali
        this.messages.add(new Message("user",prompt));
    }

}