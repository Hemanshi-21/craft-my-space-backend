package com.craftmyspace.service.impl;

import com.craftmyspace.dto.PlotReq;
import com.craftmyspace.dto.ResponseCodeJson;
import com.craftmyspace.dto.UniversalResponse;
import com.craftmyspace.model.Plots;
import com.craftmyspace.repository.PlotsRepository;
import com.craftmyspace.service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PlotServiceImpl implements PlotService {

    @Autowired
    private PlotsRepository plotsRepository;

    @Override
    public UniversalResponse<List<Plots>> getPlotsBySize(PlotReq plotReq) {
        UniversalResponse<List<Plots>> response = new UniversalResponse<>();
        List<Plots> plots = plotsRepository.findBySizeAndIsDeleted(plotReq.getPlotSize(), 0);
        plots.forEach(plot-> {
            List<String> imagelist = Arrays.asList(plot.getImageLink().split("\\s*,\\s*"));
            plot.setImages(imagelist);
        });
        response.setList(plots);
        response.setResponseCodeJson(new ResponseCodeJson(HttpStatus.OK.getReasonPhrase(), HttpStatus.OK.value()));
        return response;
    }
}
