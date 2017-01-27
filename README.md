# Stopwatch tasks by Pawat Nakpiphatkul

## The results

I ran the tasks on a HP Envy13, and got these results:

| Task                                                    | Time           |
|:------------------------------------------------------- | --------------:|
| Append 50,000 chars to String                           | 1.362672 sec   |
| Append 100,000 chars to String                          | 2.675100 sec   |
| Append 100,000 chars to StringBuilder                   | 0.005384 sec   |
| Sum array of double primitives with count=1,000,000,000 | 1.500484 sec   |
| Sum array of Double objects with count=1,000,000,000    | 5.801572 sec   |
| Sum array of BigDecimal with count=1,000,000,000        | 10.396341 sec  |

## Explanation of Results

1. Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
  * Because it appending twice of 50,000 chars.
2. Why is there such a big difference in the time used to append chars to a String and to a StringBuilder?
  * Because String is immutable, when concat the String with `+`, compilers will create a StringBuilder and append two Strings then use `toString()` to return String. This means when concat Strings 100,000 times need to create 100,000 objects of StringBuilder while uses StringBuilder to append is create only one object of StringBulider. 
3. why is there a significant difference in times to sum double, Double, and BigDecimal values?
  * The double type calculation can change the data directly from heap but Double and BigDecimal must build objects and call method for calculation.
  * BigDecimal is slower than Double because it uses more memory.
