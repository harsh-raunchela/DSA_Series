package Day_2.FlippinganImage;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i = 0; i < n ; i ++){
            int l = 0;
            int r = n - 1;

            while(l <= r){
                int temp = image[i][l];
                image[i][l] = image[i][r] ^ 1;
                image[i][r] = temp ^ 1;
                l++;
                r--;
            }
        }
        return image;
    }
}