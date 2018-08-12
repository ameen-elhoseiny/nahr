package com.nahr.server.exams.quraan;

import com.nahr.server.model.QuraanQuestion;
import lombok.Data;

import java.util.List;

/**
 * Created by ameen on 05/08/2018.
 */
@Data
public class QuraanExamDTO {


  private final List<QuraanQuestion> quraanQuestions;

  public QuraanExamDTO(List<QuraanQuestion> quraanQuestions) {
    this.quraanQuestions = quraanQuestions;
  }
}
