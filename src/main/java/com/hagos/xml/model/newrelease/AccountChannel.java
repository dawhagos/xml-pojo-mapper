package com.hagos.xml.model.newrelease;

import lombok.Data;

@Data
public class AccountChannel {
    private String accountName;
    private String channelDisplayName;
    private String visibility;
    private String videoId;
    private String usagePolicy;
    private String enableContentIdMatches;
    private String action;
    private String xmlType;
    private String assetId;
    private String goLiveDateTime;
    private String scheduledBy;
    private String distributor;
    private String assetNameSuffix;
}
