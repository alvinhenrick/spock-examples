package org.example

import spock.lang.Specification
import spock.lang.Unroll
import static org.example.Calculator.take

/**
 * Created by ahenrick on 6/11/14.
 */
@Unroll
class CalculatorSpecification extends Specification {

    def "should calculate: #x + #y = #sum"() {

        expect:
        take(x).add(y).calculate() == sum

        where:
        x | y  | sum
        3 | 4  | 7
        2 | 5  | 7
        8 | -1 | 7

    }

    def "should subtract numbers"() {

        given:
        Calculator calculator = new Calculator()
        when:
        calculator.add(4).subtract(4)
        then:
        calculator.calculate() == 0

    }

    def "should multiply"() {

        expect:
        take(2).multiply(2).calculate() == 4

    }
}
