package com.craftmyspace.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "plots")
public class Plots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "plotId")
    private String plotId;

    @Column(name = "size")
    private Integer size;

    @Column(name = "isDeleted")
    private Integer isDeleted;

    @Column(name = "imageLink")
    private String imageLink;

    @Column(name = "builtUpArea")
    private String builtUpArea;

    @Column(name = "labourCost")
    private String labourCost;

    @Column(name = "cement")
    private String cement;

    @Column(name = "cementCost")
    private String cementCost;

    @Column(name = "steel")
    private String steel;

    @Column(name = "steelCost")
    private String steelCost;

    @Column(name = "sand")
    private String sand;

    @Column(name = "sandCost")
    private String sandCost;

    @Column(name = "aggregate")
    private String aggregate;

    @Column(name = "aggregateCost")
    private String aggregateCost;

    @Column(name = "bricks")
    private String bricks;

    @Column(name = "bricksCost")
    private String bricksCost;

    @Column(name = "material")
    private String material;

    @Column(name = "materialCost")
    private String materialCost;

    @Column(name = "facing")
    private String facing;

    @Column(name = "completionTime")
    private String completionTime;

    @Column(name = "miscellaneous")
    private String miscellaneous;

    @Column(name = "miscellaneousCost")
    private String miscellaneousCost;

    @Column(name = "totalCost")
    private String totalCost;

    @Column(name = "dimension")
    private String dimension;

    @Column(name = "floor")
    private Integer floor;

    @Transient
    private List<String> images;
}
