package application;

import exceptions.InvalidTriangleException;
import strategies.EquilateralTriangleStrategy;
import strategies.IsoscelesTriangleStrategy;
import strategies.ScaleneTriangleStrategy;
import strategies.TriangleStrategy;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // list of possible implementations
        List<TriangleStrategy> strategies = List.of(new ScaleneTriangleStrategy(), new IsoscelesTriangleStrategy(), new EquilateralTriangleStrategy());

        System.out.print("Enter the side 1 of the triangle: ");
        var side1 = scanner.nextBigDecimal();

        System.out.print("Enter the side 2 of the triangle: ");
        var side2 = scanner.nextBigDecimal();

        System.out.print("Enter the side 3 of the triangle: ");
        var side3 = scanner.nextBigDecimal();

        if (side1.compareTo(BigDecimal.ZERO) <= 0 || side2.compareTo(BigDecimal.ZERO) <= 0 || side3.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidTriangleException("There's no triangle if one side is less than or equal to 0");
        }
        if (side1.add(side2).compareTo(side3) < 0 || side1.add(side3).compareTo(side2) < 0 || side2.add(side3).compareTo(side1) < 0) {
            throw new InvalidTriangleException("The combined length of any two sides must be greater than or equal to the length of the remaining side");
        }

        var strategy = strategies.stream()
                .filter(s -> s.supports((side1), (side2), (side3)))
                .findFirst()
                .orElseThrow(() -> new InvalidTriangleException("Invalid triangle sides"));


        System.out.println("The triangle is " + strategy.getName() + ", and its area is measured as follows: " + String.format("%.2f", strategy.calculateArea(side1, side2, side3)));

        System.out.println("The triangle is " + (strategy.isDegenerate((side1), (side2), (side3)) ? "" : "not ") + "degenerate");
        scanner.close();
    }
}