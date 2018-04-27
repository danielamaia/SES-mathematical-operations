/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.up.feup.mesw.ses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author Daniela
 */
@Stateless
public class MathematicalOperationsSessionBean implements MathematicalOperationsSessionBeanRemote {
    private ArrayList<String> history = new ArrayList();
    @Override
    @RolesAllowed({"high", "medium", "low"})
    public double squareRoot(double x) {

        return Math.sqrt(x);

    }

    @Override
    @RolesAllowed({"high", "medium", "low"})
    public double cubicRoot(double x) {

        return Math.cbrt(x);

    }

    @Override
    @RolesAllowed({"high", "medium"})
    public double powerExponent(double base, double exponent) {

        return Math.pow(base, exponent);

    }

    @Override
    @RolesAllowed("high")
    public double logarithmGivenBase(double x, double y) {

        return Math.log(y) / Math.log(x);

        //logb x = log kx/log k b
    }

    @Override
    public void saveToHistory(String x, String y, String operation, String result) {
        operation = operation + " " + x + " " + y + " = " + result;
        history.add(operation);
    }

    @Override
    public ArrayList<String> getHistory() {
        return history;
    }
}
