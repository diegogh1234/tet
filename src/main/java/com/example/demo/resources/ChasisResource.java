package com.example.demo.resources;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChasisResource {
    int cpus;
    long maximumMemory;
    long totalMemory;
    long freeMemory;
    double elapseTime;
    double totalSpace;
    double freeSpace;
}
