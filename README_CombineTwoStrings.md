# Combine Two Strings

Your task is to Combine two Strings. But consider the rule...

Input Strings a and b: For every character in string a swap the casing of every occurrence of the same character in
string b. Then do the same casing swap with the inputs reversed. Return a single string consisting of the changed
version of a followed by the changed version of b. A char of a is in b regardless if it's in upper or lower case - see
the test cases too. I think that's all;-)...

By the way you don't have to check errors or incorrect input values, everything is ok without bad tricks, only two input
strings and as result one output string;-)...

Some easy examples:

Input: "abc" and "cde"      => Output: "abCCde"
Input: "ab" and "aba"       => Output: "aBABA"
Input: "abab" and "bababa"  => Output: "ABABbababa"

### Hints:

- Write test cases to prove your results.
- Don't forget edge cases.
- Go for speed. Efficiency will improve your score. Time your test runs.

#### Examples:

- Input: "abc" and "cde"      => Output: "abCCde"
- Input: "ab" and "aba"       => Output: "aBABA"
- Input: "abab" and "bababa"  => Output: "ABABbababa"