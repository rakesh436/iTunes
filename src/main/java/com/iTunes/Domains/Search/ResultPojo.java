package com.iTunes.Domains.Search;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ResultPojo {

    private String wrapperType;
    private String kind;
    private int trackId;
    private String artistName;
    private String trackName;
    private String trackCensoredName;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private double collectionPrice;
    private double trackPrice;
    private double trackRentalPrice;
    private double collectionHdPrice;
    private double trackHdPrice;
    private double trackHdRentalPrice;
    private Date releaseDate;
    private String collectionExplicitness;
    private String trackExplicitness;
    private int trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
    private String contentAdvisoryRating;
    private String shortDescription;
    private String longDescription;
}
