package com.QuizApplication.Master.Service;

import com.QuizApplication.Master.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.QuizApplication.Master.dao.QuestionDao;

@Service
public class QuestionService {

    @Autowired
    QuestionDao queDao;

    //ADDING QUESTION IN THE DATABASE
    public String addQuestion(
            String statement, String Opt1, String Opt2, String Opt3, String Opt4, String corrOpt
    ){
        Question question = new Question();

        question.setStatement(statement);
        question.setCorrectAns(corrOpt);
        question.setOption1(Opt1);
        question.setOption2(Opt2);
        question.setOption3(Opt3);
        question.setOption4(Opt4);

        queDao.save(question);

        return "Question Added Successfully";
    }

    //FETCHING ALL QUESTION FROM DATABASE
    public Iterable<Question> getAllQuestions(){
        return queDao.findAll();
    }

    public String deleteAll(){
        queDao.deleteAll();
        return "All Questions are deleted Successfully";
    }
}
