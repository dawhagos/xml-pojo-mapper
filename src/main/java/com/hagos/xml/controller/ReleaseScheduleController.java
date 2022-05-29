package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hagos.xml.model.newrelease.AccountChannel;
import com.hagos.xml.model.newrelease.ReleaseSchedule;
import com.hagos.xml.model.newrelease.ReleaseScheduleWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "New Release Claims Info")
@Log
public class ReleaseScheduleController {

    @PostMapping(path = "/accountchannel", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> createNewAccountChannel(@RequestBody String payload){
        log.info(String.format("[/accountchannel] POST endpoint invoked"));
        try {
        ObjectMapper objectMapper = new ObjectMapper();
        final AccountChannel accountChannel = objectMapper.readValue(payload, AccountChannel.class);
            System.out.println(accountChannel);
            return ResponseEntity.ok(accountChannel);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping(path = "/releaseschedule", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> createNewReleaseSchedule(@RequestBody String payload){
        log.info(String.format("[/releaseschedule] POST endpoint invoked"));
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            final ReleaseSchedule releaseSchedule = objectMapper.readValue(payload, ReleaseSchedule.class);
            System.out.println(releaseSchedule);
            return ResponseEntity.ok(releaseSchedule);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping(path = "/newreleaseclaimsinfo", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> createNewReleaseClaimsInfo(@RequestBody String payload) {
        log.info(String.format("[/newreleaseclaimsinfo] POST endpoint invoked"));
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            final ReleaseScheduleWrapper releaseScheduleWrapper = objectMapper.readValue(payload, ReleaseScheduleWrapper.class);
            System.out.println(releaseScheduleWrapper);
            return ResponseEntity.ok(releaseScheduleWrapper);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
