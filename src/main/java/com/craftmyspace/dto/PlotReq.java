package com.craftmyspace.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlotReq {
    private int plotSize;
    private String plotDimension;
}
