package org.esg.exercise.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDto {
    private String customerRef;
    private String customerName;
    private String addressLineOne;
    private String addressLineTwo;
    private String town;
    private String county;
    private String country;
    private String postcode;
}
