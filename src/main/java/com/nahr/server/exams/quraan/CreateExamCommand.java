package com.nahr.server.exams.quraan;

import com.nahr.server.model.QuraanQuestion;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by ameen on 06/08/2018.
 */
@Data
public class CreateExamCommand {
  private String code;

  private Date activationDate;

  private List<QuraanQuestion> quraanQuestions;

  public CreateExamCommand(List<QuraanQuestion> quraanQuestions) {
    this.quraanQuestions = quraanQuestions;
  }

  public  List<QuraanQuestion> getQuraanQuestions(){
    return quraanQuestions;
  }

}
