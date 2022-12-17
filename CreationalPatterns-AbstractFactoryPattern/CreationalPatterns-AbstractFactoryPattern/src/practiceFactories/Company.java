/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceFactories;

import practiceProducts.Gpu;
import practiceProducts.Monitor;

/**
 *
 * @author anticn
 */
public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}