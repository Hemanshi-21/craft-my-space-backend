package com.craftmyspace.controller;

import com.craftmyspace.dto.PlotReq;
import com.craftmyspace.dto.ResponseCodeJson;
import com.craftmyspace.dto.UniversalResponse;
import com.craftmyspace.model.Plots;
import com.craftmyspace.service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("plot")
public class PlotController {
    @Autowired
    private PlotService plotService;

    @PostMapping(value = "/getPlotsBySize")
    public ResponseEntity<?> getPlotsBySize(@RequestBody PlotReq plotReq) {
        UniversalResponse<List<Plots>> response = plotService.getPlotsBySize(plotReq);
        ResponseCodeJson responseCodeJson = response.getResponseCodeJson();
        /*if (responseCodeJson.getCode() == 200)
            return new ResponseEntity<>(response, HttpStatus.OK);
        else*/
            return new ResponseEntity<>(response, HttpStatus.valueOf(responseCodeJson.getCode()));
    }
}
