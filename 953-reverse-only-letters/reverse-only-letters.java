class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            // If left is not a letter, move left
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // If right is not a letter, move right
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // Both are letters → swap
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
}
