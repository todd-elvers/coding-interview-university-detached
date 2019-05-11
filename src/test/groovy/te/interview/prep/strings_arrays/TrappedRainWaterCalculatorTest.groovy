package te.interview.prep.strings_arrays

import groovy.transform.NotYetImplemented
import spock.lang.Specification
import spock.lang.Subject

class TrappedRainWaterCalculatorTest extends Specification {

    @Subject
    TrappedRainWaterCalculator rainWaterCalculator = []

    @NotYetImplemented
    def "can determine how much rain water is trapped"(int[] elevationHeights, int amountOfTrappedWater) {
        expect:
            rainWaterCalculator.calculate(elevationHeights) == amountOfTrappedWater

        where:
            elevationHeights                     || amountOfTrappedWater
            [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] || 6
    }

}
