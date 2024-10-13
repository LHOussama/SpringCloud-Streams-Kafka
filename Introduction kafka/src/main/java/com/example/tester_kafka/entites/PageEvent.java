package com.example.tester_kafka.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
