package com.example.demo.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.common.MessageResponseDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderCheckAvalResultDTO {

    List<OrderLineDTO> itemsThatCannotBeOrdered;
    MessageResponseDTO result;
    Boolean available;

    public OrderCheckAvalResultDTO(MessageResponseDTO result) {
        this.result = result;
        itemsThatCannotBeOrdered = new ArrayList<>();
    }

    public OrderCheckAvalResultDTO(MessageResponseDTO itemsNotAvailable, List<OrderLineDTO> invalidItems, Boolean available) {
        this.result = itemsNotAvailable;
        this.itemsThatCannotBeOrdered = invalidItems;
        this.available = available;
    }
}
