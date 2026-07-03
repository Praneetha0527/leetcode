class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int m = left;
        int n = right;
        for(int i = left; i <= right; i++) {
            int count = 0, counts = 0;
            int temp = i;
            int num = i;
            while(num > 0){
                int temps = num % 10;
                count++;
                if(temps != 0 && temp % temps == 0) {
                counts++;
                }
                num /= 10;
            }
            if(count == counts){
                list.add(temp);
            }
        }
        return list;
    }
}