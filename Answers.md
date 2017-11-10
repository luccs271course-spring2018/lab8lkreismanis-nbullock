#Answers
## By Larisa Kreismanis and Nathan Bullock
1. Try using a TreeMap instead of a HashMap. Does this make any difference?
- There is a very small difference between using a TreeMap instead of a HashMap. A TreeMap has keys that are sorted and in order, while HashMap does not guarantee that keys will be sorted in order.

2. What happens if you invoke countWords multiple times for different String iterators?
- When you invoke countWords multiple times for different String iterators, the iterator will regardless refer to the same map.

3. What crucial role does the Iterator abstraction play in making WordCounter testable?
- The crucial role that Iterator abstraction plays in making WordCounter testable is that Iterator adds to the map.