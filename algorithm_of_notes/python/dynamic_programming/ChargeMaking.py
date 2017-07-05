#coding=utf-8
def charge_making(money, num):
    '''
    找零问题
    '''
    count = [0] * (num + 1)
    count[0] = 0
    for j in range(1, num + 1):
        minCoins = j
        for i in range(len(money)):
            if j - money[i] >= 0:
                temp = count[j - money[i]] + 1
                if temp < minCoins:
                    minCoins = temp
        
        count[j] = minCoins
    
    return count[num]

money = [1, 3, 2, 5]
num = 8
count = charge_making(money, num)
print(count)