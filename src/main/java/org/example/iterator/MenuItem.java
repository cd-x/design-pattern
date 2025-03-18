package org.example.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private boolean vegeterian;
}
