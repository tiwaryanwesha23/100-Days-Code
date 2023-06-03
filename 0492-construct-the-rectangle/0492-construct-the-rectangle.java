class Solution {
    public int[] constructRectangle(int area) {
         int[] result = new int[2];
        int w = (int)Math.sqrt(area);
        while(area%w!=0){
            w--;
        }
        result[0] = area/w;
        result[1] = w;
        return result;
    }
}