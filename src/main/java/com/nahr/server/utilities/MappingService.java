package com.nahr.server.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

/**
 * Created by ameen on 05/08/2018.
 */
@Service
public class MappingService {
  ObjectMapper mapper = new ObjectMapper();

  /**
   * @param source         the input Object NOT NULL user with DTO
   * @param resultClass the datatype of the result
   * @return Object filled by the properties of the input object
   * </br>
   * <B>WARNING , multilevel ,and recursive input is not handled by this method yet rakkez keda ma3aya Allah yekremak  also date format from String</B>
   */
  public <Destination> Destination map(Object source, Class<Destination> resultClass) {
    return mapper.convertValue(source, resultClass);
  }
}
