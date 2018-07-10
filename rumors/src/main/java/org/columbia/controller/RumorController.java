package org.columbia.controller;

import org.columbia.dto.RumorDto;
import org.columbia.dto.RumorIdDto;
import org.columbia.entity.RumorEntity;
import org.columbia.service.RumorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api")
public class RumorController {

    @Autowired
    RumorService rumorService;

       // @PathVariable
    @RequestMapping(value = "/rumor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> createRumor(@RequestBody RumorDto rumor) {

        RumorEntity entity = rumorService.convertToRumorEntity(rumor);
        rumorService.createRumor(entity);
        RumorIdDto rumorId = rumorService.convertToRumorIdDto(entity);

        return new ResponseEntity<RumorIdDto>(rumorId, HttpStatus.CREATED);
    }



}
