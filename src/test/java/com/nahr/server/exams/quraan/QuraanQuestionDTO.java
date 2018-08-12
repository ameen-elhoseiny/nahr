package com.nahr.server.exams.quraan;

import lombok.Data;

/**
 * Created by ameen on 12/08/2018.
 */
@Data
public class QuraanQuestionDTO {
  private final int startSurahIndex;

  private final int startAyahIndex;

  private final int endSurahIndex;

  private final int endAyahIndex;

  public QuraanQuestionDTO(int startSurahIndex, int startAyahIndex, int endSurahIndex, int endAyahIndex) {

    this.startSurahIndex = startSurahIndex;
    this.startAyahIndex = startAyahIndex;
    this.endSurahIndex = endSurahIndex;
    this.endAyahIndex = endAyahIndex;
  }
}
