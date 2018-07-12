package org.columbia.controller;

import org.columbia.dto.RumorDto;
import org.columbia.dto.RumorIdDto;
import org.columbia.dto.RumorListDto;
import org.columbia.entity.RumorEntity;
import org.columbia.service.RumorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.service.ResponseMessage;

import java.util.UUID;


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

    @RequestMapping(value = "/rumor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> returnEmptyListOfRumors() {

        RumorListDto rumors = rumorService.getAllRumors();
        return new ResponseEntity<RumorListDto>(rumors, HttpStatus.OK);
    }

    @RequestMapping(value = "/rumor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> returnRumorById(@PathVariable UUID id) {

        if (rumorService.rumorExistsBbyId(id)) {
            RumorEntity entity = rumorService.getRumorByID(id);
            RumorIdDto rumor = rumorService.convertToRumorIdDto(entity);
            return new ResponseEntity<RumorIdDto>(rumor, HttpStatus.OK);
        } else return ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "/rumor/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<?> deleteRumorById(@PathVariable UUID id) {

        //RumorEntity entity = rumorService.getRumorByID(id);
        if (rumorService.rumorExistsBbyId(id)) {
            rumorService.deleteRumorbyId(id);
            return ResponseEntity.noContent().build();
        } else return ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "/rumor", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<?> shouldDeleteAllRumors() {

        rumorService.deleteAllRumors();
        return ResponseEntity.noContent().build();
    }
}
