package com.QuizApplication.Master.Controller;

import com.QuizApplication.Master.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.QuizApplication.Master.Service.QuestionService;

@RestController
@CrossOrigin
@RequestMapping(path = "/quiz")
public class QuestionController {


    //the Service Object to coordinate with the Database
    @Autowired
    private QuestionService queService;

    @PostMapping(path = "/add")
    public @ResponseBody String addQuestion(
            @RequestParam String statement,@RequestParam String Opt1,@RequestParam String Opt2,@RequestParam String Opt3,@RequestParam String Opt4,@RequestParam String corrOpt
    ){
        return queService.addQuestion(
                statement, Opt1, Opt2, Opt3, Opt4, corrOpt
        );
    }

    @GetMapping(path = "/allQuestions")
    public @ResponseBody Iterable<Question>getAllQuestions(){
        return queService.getAllQuestions();
    }

    @GetMapping(path = "/deleteAll")
    public @ResponseBody String deleteAll(){
        return queService.deleteAll();
    }
}
