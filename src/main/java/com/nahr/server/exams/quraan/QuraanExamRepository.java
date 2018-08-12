package com.nahr.server.exams.quraan;

import com.nahr.server.model.QuraanExam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ameen on 05/08/2018.
 */
@Repository interface QuraanExamRepository extends CrudRepository<QuraanExam, Integer> {
}
