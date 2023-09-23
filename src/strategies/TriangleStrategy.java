package strategies;

import java.math.BigDecimal;

public interface TriangleStrategy {

    boolean supports(BigDecimal side1, BigDecimal side2, BigDecimal side3);

    String getName();

    default double calculateArea(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
        // Heron's formula for finding the area of a triangle
        var semiPerimeter = (side1.add(side2).add(side3)).divide(BigDecimal.valueOf(2));
        return Math.sqrt(semiPerimeter.doubleValue() * (semiPerimeter.subtract(side1)).doubleValue() * (semiPerimeter.subtract(side2)).doubleValue() * (semiPerimeter.subtract(side3)).doubleValue());
    }


    default boolean isDegenerate(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
        return false;
    }

}
