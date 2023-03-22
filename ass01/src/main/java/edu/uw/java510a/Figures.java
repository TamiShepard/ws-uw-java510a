package edu.uw.java510a;

/**
 * CP510 Assignment 1
 * @author ShepardTM
 */
public class Figures {
    /**
     * Entry point. Calculate the perimeter and area of rectangles and circles.
     * @param args command-line arguments, not used.
     */
    public static void main(String[] args) {

        // Test cases for area/perimeter of rectangles when given two sides.

        double[][] rects = { { 5, 10 }, { 15, 6 }, { 7, 19 }, { 0, 0 }, { 0, 20 }, { 20, 0 }, { -1, -1 }, { -1, 1 },
                { 1, -1 } };

        String fmt = "\tside1: %10.5f, side2: %10.5f, " + "peri = %10.5f, area = %10.5f%n";
        System.out.println("\nRectangles");
        for (double[] rect : rects) {
            double side1 = rect[0];
            double side2 = rect[1];
            double peri = rectPerimeter(side1, side2);
            double area = rectArea(side1, side2);
            System.out.printf(fmt, side1, side2, peri, area);
        }

        // Test cases for area/perimeter of circles when given the radius

        double[] circs = { 5, 10, 15, 0, -1 };
        fmt = "\tradius: %10.5f, peri = %10.5f, area = %10.5f%n";
        System.out.println("\nCircles");
        for (double radius : circs) {
            double peri = circPerimeter(radius);
            double area = circArea(radius);
            System.out.printf(fmt, radius, peri, area);
        }

        // Test cases for area/perimeter of rectanges when given the diagonal and the
        // slope

        double[][] diags = { { 5, 3.0 / 4.0 }, { -5, 3.0 / 4.0 }, { 5, -3.0 / 4.0 }, { -5, -3.0 / 4.0 }, { 0, 0 },
                { 0, 3.0 / 4.0 }, { 0, -3.0 / 4.0 }, { 5, 0 }, { -5, 0 } };
        fmt = "\tdiag: %10.5f, slope: %10.5f, peri = %10.5f, area = %10.5f%n";
        System.out.println("\nDiagonals/slope");
        for (double[] diag : diags) {
            double diagonal = diag[0];
            double slope = diag[1];
            double peri = rectPerimeterDiag(diagonal, slope);
            double area = rectAreaDiag(diagonal, slope);
            System.out.printf(fmt, diagonal, slope, peri, area);
        }
    }

    /**
     * Given two adjacent sides of a rectangle, compute the perimeter
     * @param side1 the first side; must be greater than 0
     * @param side2 the adjacent side; must be greater than 0
     * @return the perimeter of the rectangle, or Double.NaN if either parameter is
     *         invalid
     */
    public static double rectPerimeter(double side1, double side2) {
        return (side1 > 0.0 && side2 > 0.0) ? (2.0 * side1) + (2.0 * side2) : Double.NaN;
    }

    /**
     * Given two adjacent sides of a rectangle, computer the area
     * @param side1 the first side; must be greater than 0
     * @param side2 the adjacent side; must be greater than 0
     * @return the area of the rectangle, or Double.NaN if either parameter is
     *         invalid
     */
    public static double rectArea(double side1, double side2) {
        return (side1 > 0.0 && side2 > 0.0) ? side1 * side2 : Double.NaN;
    }

    /**
     * Given the radius of a circle, calculate the perimeter of the circle.
     * @param radius the radius; must be greater than 0
     * @return the perimeter of the circle, or Double.NaN if the parameter is
     *         invalid
     */
    public static double circPerimeter(double radius) {
        return radius > 0 ? 2.0 * Math.PI * radius : Double.NaN;
    }

    /**
     * Given the radius of a circle, calculate the area of the circle.
     * @param radius the radius of the circle; must be greater than 0
     * @return the area of the circle, or Double.NaN if the parameter is invalid
     */
    public static double circArea(double radius) {
        return radius > 0 ? Math.PI * radius * radius : Double.NaN;
    }

    ///////////////////////////////////////////////////////////////////////
    // Bonus: for an extra 10 points, complete the following methods.
    ///////////////////////////////////////////////////////////////////////

    /**
     * Given the length and slope of the diagonal of a rectangle, compute the
     * perimeter of the rectangle.
     * @param diag  the given length; must be greater than 0
     * @param slope the given slope; slope cannot equal 0, but can be negative
     * @return the perimeter of the rectangle, or Double.NaN if either parameter is
     *         invalid
     */
    public static double rectPerimeterDiag(double diag, double slope) {
        return (diag > 0 && slope != 0) ? (2 * diag) * ((1 + Math.abs(slope)) / (Math.sqrt(1 + slope * slope)))
                : Double.NaN;
    }

    /**
     * Given the length and slope of the diagonal of a rectangle, compute the area
     * of the rectangle.
     * @param diag  the given length; must be greater than 0
     * @param slope the given slope; slope cannot equal 0, but can be negative
     * @return the area of the rectangle, or Double.NaN if either parameter is
     *         invalid
     */
    public static double rectAreaDiag(double diag, double slope) {
        return (diag > 0 && slope != 0) ? ((diag * diag * Math.abs(slope)) / (1 + slope * slope)) : Double.NaN;
    }
}
