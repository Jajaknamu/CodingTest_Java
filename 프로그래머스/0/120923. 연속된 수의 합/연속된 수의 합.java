class Solution {
    public int[] solution(int num, int total) {
       
        int tempSum =0;
        for (int i = 0; i < num; i++) {
            tempSum += i;
        }

        int start = (total - tempSum) / num;

        int[] answer = new int[num];

        for (int j = 0; j < num; j++) {
            answer[j] = start + j;
        }

        return answer;
    }
}