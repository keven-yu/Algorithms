def subset_sum_problem(sets, sum):
    row = len(sets) + 1
    col = sum + 1
    solutionMatrix = [[0 for c in range(col)] for r in range(row)]
    solutionMatrix[0][0] = 1
    for i in range(1, col):
        solutionMatrix[0][i] = 0

    for j in range(1, row):
        solutionMatrix[j][0] = 1
        for k in range(1, col):
            solutionMatrix[j][k] = solutionMatrix[j - 1][k]
            if solutionMatrix[j][k] == 1:
                solutionMatrix[j][k] = solutionMatrix[j][k]
            elif (k - sets[j - 1] >= 0) and (solutionMatrix[j][k - sets[j - 1]] == 1):
                solutionMatrix[j][k] = solutionMatrix[j][k - sets[j - 1]]
            else:
                solutionMatrix[j][k] = 0
            if k == col - 1 and solutionMatrix[j][k] == 1:
                return True

    return False

sets = [7, 34, 4, 12, 5, 3]
num = 1
is_exist = subset_sum_problem(sets, num)
print(is_exist)