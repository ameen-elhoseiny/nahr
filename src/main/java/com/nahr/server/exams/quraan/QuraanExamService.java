package com.nahr.server.exams.quraan;

import com.nahr.server.model.QuraanExam;
import com.nahr.server.utilities.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ameen on 05/08/2018.
 */
@Service
public class QuraanExamService {

  @Autowired
  private MappingService mappingService;

  @Autowired
  private QuraanExamRepository quraanExamRepository;

  public QuraanExamDTO createExam(CreateExamCommand createExamCommand) {
    //extract data from  command
    QuraanExam exam = mappingService.map(createExamCommand, QuraanExam.class);

    //Save date to DB
    exam = quraanExamRepository.save(exam);
    // response with data transfer object
    return mappingService.map(exam,QuraanExamDTO.class);
  }
}
