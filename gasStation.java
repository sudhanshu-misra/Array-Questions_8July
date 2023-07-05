class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int i;
        int totalGas = 0;
        int totalCost = 0;

        for(i = 0; i < gas.length; i++)
        {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalCost > totalGas) return -1;

        int currentGas = 0;
        int start = 0;

       
        for(i = 0; i < gas.length; i++)
        {
            currentGas += gas[i] - cost[i];
            
            if(currentGas < 0)
            {
                currentGas = 0;
                start = i+1;
            }
        }
        
        return start;
        
    }
}