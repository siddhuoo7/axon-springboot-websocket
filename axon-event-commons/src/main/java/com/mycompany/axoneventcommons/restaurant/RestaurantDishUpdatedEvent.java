package com.mycompany.axoneventcommons.restaurant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDishUpdatedEvent implements RestaurantEvent {

    private String restaurantId;
    private String dishId;
    private String dishName;
    private BigDecimal dishPrice;
}
