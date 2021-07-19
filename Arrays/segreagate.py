arr=[1,7,-1,2,4,-5,-7,11]
pos =[]
neg =[]
        
for item in arr:
    if(item>0):
        pos.append(item)
    elif(item<0):
        neg.append(item)

pos.extend(neg)
for k in range(n):
    arr[k] = pos[k]