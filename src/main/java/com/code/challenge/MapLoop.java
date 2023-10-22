package com.code.challenge;

import com.code.dto.APIMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapLoop {

  public static List<APIMessage> solution(Map<String, APIMessage> map) {
    List<APIMessage> messsageList = new ArrayList<>();

    for (APIMessage apiMessage : map.values()) {
      messsageList.add(apiMessage);
    }

    return messsageList;
  }

  public static List<APIMessage> solution2(Map<String, APIMessage> map) {
    List<APIMessage> messsageList = new ArrayList<>();

    for (Map.Entry<String, APIMessage> entry : map.entrySet()) {
      messsageList.add(entry.getValue());
    }

    return messsageList;
  }

  public static List<APIMessage> solution3(Map<String, APIMessage> map) {
    List<APIMessage> messsageList = new ArrayList<>();

    map.forEach((key, value) -> messsageList.add(value));

    return messsageList;
  }

}
