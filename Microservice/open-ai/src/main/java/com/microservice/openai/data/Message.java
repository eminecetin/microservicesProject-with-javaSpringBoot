package com.microservice.openai.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //kendisi getter setteri yapıyor Dikkat kontrol yok
@AllArgsConstructor //parametreli constructure oluşturuyor, yapılandırıcı metot
@NoArgsConstructor //parametresiz constructor, yapılandırıcı metot
public class Message {
    private String role;
    private String content;


}