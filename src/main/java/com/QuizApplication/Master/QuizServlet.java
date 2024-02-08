package com.QuizApplication.Master;

import com.QuizApplication.Master.Controller.QuestionController;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class QuizServlet extends HttpServlet {
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException
    {
        String statement = request.getParameter("statement");
        String opt1 = request.getParameter("opt1");
        String opt2 = request.getParameter("opt2");
        String opt3 = request.getParameter("opt3");
        String opt4 = request.getParameter("opt4");
        String corrOpt = request.getParameter("corrOpt");

        QuestionController questionController = new QuestionController();

        questionController.addQuestion(
                statement, opt1, opt2, opt3, opt4, corrOpt
        );

        response.getWriter().write("Data submitted successfully!");

    }
}
