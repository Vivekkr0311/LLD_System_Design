package com.Vivek;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Jumper {
    int startPoint;
    int endPoint;

    public Jumper(int startPoint, int endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
}

