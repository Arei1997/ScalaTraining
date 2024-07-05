// The order of precedence is = , ! , < > , && , |
// Can be found in scala textbook or documentation


//1. do && which is false, then || which is true
val s1: Boolean = true || false && false

//2. do () first which is true, then the && which is false
val s2: Boolean = (true || false) && false

//3. 1 < 4 is true, 7!=10 is true, 9+10==21 is true
// do the && operator which is true
// then the || which is true
val s3: Boolean = (1 < 4 && 7!=10 || 9 + 10 ==21)