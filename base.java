class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}
/*note that if you need to find the base of a number use this logic 
return Integer.toString(num,radix) 
if i need to return a number means this builtin function
 Integer.parseInt(Integer.toString(100, 7))*/
