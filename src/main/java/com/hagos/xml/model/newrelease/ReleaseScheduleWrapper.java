package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReleaseScheduleWrapper {
    @JsonProperty(value = "ReleaseSchedule")
    private ReleaseSchedule releaseSchedule;
}
