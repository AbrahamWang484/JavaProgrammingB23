##Stream

1. A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channelsf.
2. Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
3. Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.


#####map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream. 
#####filter: The filter method is used to select elements as per the Predicate passed as argument.
#####sorted: The sorted method is used to sort the stream.