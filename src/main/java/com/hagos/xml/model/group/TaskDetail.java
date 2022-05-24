package com.hagos.xml.model.group;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "task_detail")
public class TaskDetail {

    @JacksonXmlProperty(localName = "object_name")
    private String objectName;
    private String status;
    @JacksonXmlProperty(localName = "status_reason")
    private String statusReason;
}
