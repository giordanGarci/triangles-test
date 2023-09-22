package strategies;

import java.math.BigDecimal;

public class ScaleneTriangleStrategy implements TriangleStrategy {
    @Override
    public boolean supports(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
        return !side1.equals(side2) && !side2.equals(side3) && !side1.equals(side3);
    }

    @Override
    public String getName() {
        return "Scalene";
    }


}
