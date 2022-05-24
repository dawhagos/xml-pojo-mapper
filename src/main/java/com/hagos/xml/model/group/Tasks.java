package com.hagos.xml.model.group;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Tasks {
    @JacksonXmlProperty(localName = "task_header")
    private TaskHeader taskHeader;
}
