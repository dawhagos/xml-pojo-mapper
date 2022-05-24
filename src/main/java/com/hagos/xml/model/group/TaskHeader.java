package com.hagos.xml.model.group;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class TaskHeader {
    @JacksonXmlProperty(localName = "group_id")
    private String groupId;
    @JacksonXmlProperty(localName = "task_type")
    private String taskType;
    private String status;
    private String userid;
    private String email;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "task_detail")
    private List<TaskDetail> taskDetailList;

}
