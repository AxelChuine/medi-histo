package com.openclassrooms.medihisto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "note")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    private Long id;

    @Field(name = "patient_id")
    private Long patientId;

    @Field(name = "lastName")
    private String lastName;

    @Field(name = "meeting_date")
    private LocalDate meetingDate;

    @Field(name = "content")
    private String content;
}
