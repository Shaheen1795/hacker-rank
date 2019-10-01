#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the findDigits function below.
def findDigits(n):
     l = [int(d) for d in str(n)]
     count = 0 
     for i in range(len(l)):
          if l[i]!=0:
               if n%l[i]==0:
                     count+=1 
          else: 
                 continue   
    
     return count 
   
           
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = findDigits(n)

        fptr.write(str(result) + '\n')

    fptr.close()
