import sys

dp={};
def processNumber(value):
    originalValue=value;
    count=0;
    while(True):

        if value in dp:
            dp[originalValue]=count+dp[value];
            return dp[originalValue];
        count += 1;
        isOddOrEven = value % 2;
        if value==1:
            break;
        elif isOddOrEven==0:
            value=int(value/2);
        else:
            value=3*value +1 ;
    dp[originalValue]=count;
    return dp[originalValue];


for line in sys.stdin:
    min_num, max_num = map(int, line.split())
    print(str(min_num) + " " + str(max_num),end="")
    list=[];
    if min_num>max_num:
        min_num ^= max_num;
        max_num ^= min_num;
        min_num ^= max_num;
    for x in range(min_num,max_num+1):
        count=processNumber(x)
        list.append(count);

    print(" "+str(max(list)))
