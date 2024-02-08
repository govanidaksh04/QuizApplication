package com.QuizApplication.Master.dao;

import com.QuizApplication.Master.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionDao extends CrudRepository<Question, Integer>{
    
}
