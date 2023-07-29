package com.springfirstsprint.first_sprint_task_1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    Long id;

    String name;

    String surname;

    int exam;

    String mark;


}
