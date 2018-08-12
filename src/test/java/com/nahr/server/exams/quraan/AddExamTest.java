package com.nahr.server.exams.quraan;

import com.nahr.server.model.QuraanQuestion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ameen on 05/08/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AddExamTest {

  @Autowired
  QuraanExamService examService;

  @Test
  public void createNewExamWithOneQuestionSuccessfully() {
    //GIVEN
    //WHEN
    List<QuraanQuestion> quraanQuestions = new ArrayList<>();
    int startSurahIndex = 0;
    int startAyahIndex = 0;
    int endSurahIndex = 0;
    int endAyahIndex = 0;
    QuraanQuestionDTO quraanQuestionDTO = new QuraanQuestionDTO(startSurahIndex, startAyahIndex, endSurahIndex, endAyahIndex);
    quraanQuestions.add(quraanQuestion);
    CreateExamCommand createExamCommand = new CreateExamCommand(quraanQuestions);

    examService.createExam(createExamCommand);
    //THEN
  }

}
