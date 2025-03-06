class Solution {
    public String largestNumber(int[] nums) {
        List<String> stringNumbers = new ArrayList<>();
        for(int num : nums){
            stringNumbers.add(String.valueOf(num));
        }
        stringNumbers.sort((str1,str2)->(str2+str1).compareTo(str1+str2));
        if("0".equals(stringNumbers.get(0))){
            return "0";
        }
        return String.join("",stringNumbers);
    }
}
