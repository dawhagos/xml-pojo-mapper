package com.hagos.xml.model.newrelease;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ReleaseSchedule {
    private String sender;
    private String gpid;
    private String itemLabel;
    private List<AccountChannel> accountChannels = new ArrayList<>();
}
