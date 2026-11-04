package part02;

import java.util.stream.IntStream;
import java.util.OptionalInt;
import java.util.OptionalDouble;

/**
 * This class demonstrates how Stream operations handle situations where there
 * is no value to return. For example, if you try to get the maximum value of an
 * empty stream, there is no maximum value to return. In this case, the
 * operation returns a special value called OptionalDouble, which may or may not
 * contain a value.
 */
public class OptionalValues {

    /**
     * Returns the average of integers in the specified IntStream. If the stream is
     * empty, returns 0.0.
     *
     * @param stream the IntStream to average
     * @return the average of the numbers in the stream or 0 if the stream is empty
     */
    
    public double average(IntStream stream) {
        /*
         * See the `average()` method in the documentation of IntStream. Note that the
         * stream may be empty, so there may not be an average value. That is why the
         * method returns a special type called OptionalDouble.
         *
         * You can check if the OptionalDouble is empty by calling the `isPresent()`
         * method. Another approach is to use the `orElse()` method, which returns the
         * actual value if it is present, or an alternative value if the OptionalDouble
         * is empty.
         */
         //return double from intstream operation
        OptionalDouble optionalresult= stream.average();
        double averagefallback = optionalresult.orElse(0.0); //returning fallback values

        return averagefallback; // TODO//optionalresult used as stream could be empty. we need to represent option.
        /**
        so pratically first we get optionaldouble from stream.average.
         if its empty or smth we get the optional, however it is still optionaldouble not regular double.
          most likely we still get values.
           the double variablename = optionalresult.orElse(value,value)
            gives us the avg as a double except if it was indeed empty then we use fallback values.
             then we return it. its like many sieves!
         */
    }

    /**
     * Returns the maximum value of integers in the specified IntStream. If the
     * stream is empty, returns 0.
     *
     * @param stream the IntStream to get the maximum value from
     * @return the maximum value in the stream or 0 if the stream is empty
     */
    public int maximum(IntStream stream) {
        OptionalInt result = stream.max(); //looking for potential max value
        int resultQ = result.orElse(0); //max value is integer here
        return resultQ; //returning sieved result. thoroughly checked. papers please!
        //return -1; // TODO: see the IntStream documentation
        
    }
}
