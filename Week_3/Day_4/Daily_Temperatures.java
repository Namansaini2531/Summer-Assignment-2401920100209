import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int num = temperatures.length;
        int[] answer = new int[num];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < num; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int a = stack.pop();
                answer[a] = i - a;
            }
            stack.push(i);
        }
        return answer;
    }
}
