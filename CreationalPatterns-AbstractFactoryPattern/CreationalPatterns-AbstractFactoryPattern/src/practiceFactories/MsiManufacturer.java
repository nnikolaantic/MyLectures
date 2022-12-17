/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceFactories;

import practiceProducts.Gpu;
import practiceProducts.Monitor;
import practiceProducts.MsiGpu;
import practiceProducts.MsiMonitor;

/**
 *
 * @author anticn
 */
public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}