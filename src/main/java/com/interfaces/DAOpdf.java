/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaces;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

/**
 *
 * @author Flia Castiblanco
 */
public interface DAOpdf {
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException;
    public void printAll(Graphics2D graphics2d) throws Exception;
    
}
