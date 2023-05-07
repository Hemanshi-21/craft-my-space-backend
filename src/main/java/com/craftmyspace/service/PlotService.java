package com.craftmyspace.service;

import com.craftmyspace.dto.PlotReq;
import com.craftmyspace.dto.UniversalResponse;
import com.craftmyspace.model.Plots;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlotService {

    UniversalResponse<List<Plots>> getPlotsBySize(PlotReq plotReq);
}
