/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceFactories;

import practiceProducts.AsusGpu;
import practiceProducts.AsusMonitor;
import practiceProducts.Gpu;
import practiceProducts.Monitor;

/**
 *
 * @author anticn
 */
public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}