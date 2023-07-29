package com.springfirstsprint.first_sprint_task_1.controllers;


import com.springfirstsprint.first_sprint_task_1.db.DBManager;
import com.springfirstsprint.first_sprint_task_1.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping
    public String getStudents(Model model) {
        model.addAttribute("students", DBManager.getStudents());
        return "home";
    }

    @GetMapping("/add-student")
    public String addStudentView() {
        return "addStudent";
    }

    @PostMapping("/add-student")
    public String addStudent(@RequestParam(name = "st_name") String name,
                             @RequestParam(name = "st_surname") String surname,
                             @RequestParam(name = "st_exam") int exam) {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
