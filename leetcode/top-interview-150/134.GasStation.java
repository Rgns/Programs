
/**
134. Gas Station
Medium
11.2K
981
Companies
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the
ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index
if you can travel around the circuit once in the clockwise direction, otherwise return -1. 
If there exists a solution, it is guaranteed to be unique


**/


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int totalGas =0;
        int totalCost =0;

        for(int i=0;i<n;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalCost > totalGas ) return -1;

        int gasInCar =0;
        int start = 0;
        for(int i=0;i<n;i++){

            gasInCar += (gas[i]-cost[i]);
            if(gasInCar < 0){
                gasInCar = 0;
                start = i+1;
            }



        }

        return start;

    }
}
