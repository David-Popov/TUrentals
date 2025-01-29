package com.example.demo.dto.request;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Future;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCheckAvalDTO {

    @Future
    private LocalDate deliveryDate;
    @Future
    private LocalDate returnDate;

    private List<ItemNumberPairDTO> items;
}
