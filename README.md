# Genetic Algorithms :microscope::computer:
<img align="left" width="200" height="200" src="https://images.theconversation.com/files/125408/original/image-20160606-13045-ea307k.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip">
Genetic Algorithms (GAs) are adaptive heuristic search algorithm based on the evolutionary ideas of natural selection and genetics. As such they represent an intelligent exploitation of a random search used to solve optimization problems. Although randomised, GAs are by no means random, instead they exploit historical information to direct the search into the region of better performance within the search space. The basic techniques of the GAs are designed to simulate processes in natural systems necessary for evolution, specially those follow the principles first laid down by Charles Darwin of "survival of the fittest.". Since in nature, competition among individuals for scanty resources results in the fittest individuals dominating over the weaker ones.

## "All Ones" GA :white_check_mark:
This is a very basic problem that can be solved using binary representation.
As the name suggests, the problem is simply finding a string which is comprised entirely of ones.
So for a string with a length of 5 the best solution would be, “11111”.

## "Hello World" GA String Evolve :capital_abcd:
Evolving a target string from a population of random strings.

## Single machine scheduling with sequence dependent setup times :factory:
In progress...

## Job Sequencing
### Problem
Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes single unit of time, so the minimum possible deadline for any job is 1. How to maximize total profit if only one job can be scheduled at a time.

### Solution
A Simple Solution is to generate all subsets of given set of jobs and check individual subset for feasibility of jobs in that subset. Keep track of maximum profit among all feasible subsets. The time complexity of this solution is exponential.

This is a standard Greedy Algorithm problem.
Following is the Algorithm:

1. Sort all jobs in decreasing order of profit.
2. Initialize the result sequence as first job in sorted jobs.
3. Do following for remaining n-1 jobs
    * If the current job can fit in the current result sequence without missing the deadline, add current job to the result. Else ignore the current job.

## To-Do list :scroll::pencil2:
- [x] "All Ones" GA
- [x] "Hello World" GA - String Evolve
- [ ] Single machine scheduling with sequence dependent setup times
