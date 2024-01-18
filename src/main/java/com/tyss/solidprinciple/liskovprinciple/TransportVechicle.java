package com.tyss.solidprinciple.liskovprinciple;

import lombok.Data;
import org.apache.catalina.Engine;

@Data
public class TransportVechicle {

    private String name;
    private double speed;
//this is violating the LSP principle because vehicle with no engine are also there.
//    private Engine engine;
}
