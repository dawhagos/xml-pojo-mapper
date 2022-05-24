package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hagos.xml.Utils;
import com.hagos.xml.model.group.Tasks;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Group Processing")
@RequestMapping("group")
public class GroupController {

    @PostMapping (path = "/tasks", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getTasks(@RequestBody String taskStr) throws JsonProcessingException {
        return ResponseEntity.ok(Utils.getObject4StringPayload(taskStr, Tasks.class));
    }
}
