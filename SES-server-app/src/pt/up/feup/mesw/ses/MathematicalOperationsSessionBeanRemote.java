/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.up.feup.mesw.ses;

import javax.ejb.Remote;

/**
 *
 * @author Daniela
 */
@Remote
public interface MathematicalOperationsSessionBeanRemote {

    public double squareRoot(double x);

    public double cubicRoot(double x);

    public double powerExponent(double base, double exponent);

    public double logarithmGivenBase(double x, double y);

}
