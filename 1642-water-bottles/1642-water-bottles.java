class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newFull = empty / numExchange;
            total += newFull;
            empty = newFull + (empty % numExchange);
        }

        return total;
    }
}
