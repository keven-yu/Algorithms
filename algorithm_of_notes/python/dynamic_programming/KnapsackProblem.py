def knapsack_problem(weight, price, knapsackWeight):
    '''
    0-1背包问题
              | s[i - 1, j]                      (j - wi < 0)
    s[i, j] = |     | s[i - 1, j]
              | Max |                            (j - wi >= 0)
              |     | s[i - 1, j -wi] + pi

    Created by yulinfeng on 7/3/17.
    '''
    row = len(weight) + 1
    col = len(price) + 1
    solutionMatrix = [[0 for i in range(col)] for j in range(row)]
    values = [0] * row
    for i in range(row):
        solutionMatrix[0][i] = 0
    for j in range(col):
        solutionMatrix[j][0] = 0
    for m in range(1, row):
        for n in range(1, col):
            solutionMatrix[m][n] = solutionMatrix[m - 1][n]
            if n - weight[m - 1] >= 0 and solutionMatrix[m - 1][n - weight[m - 1]] + price[m - 1] > solutionMatrix[m][n]:
                solutionMatrix[m][n] = solutionMatrix[m - 1][n - weight[m - 1]] + price[m - 1]
        values[m] = solutionMatrix[m][col - 1]
    
    values.sort()
    return values[len(values) - 1]

weight = (2, 4, 1, 5, 2)
price = (4, 5, 19, 3, 2)
knapsackWeight = 6
value = knapsack_problem(weight, price, knapsackWeight)
print(value)