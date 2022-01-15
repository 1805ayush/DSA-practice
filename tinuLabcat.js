function prime(n) {
              
    var i, flag = true;
      
    
    n = parseInt(n)
    for(i = 2; i <= n - 1; i++)
        if (n % i == 0) {
            flag = false;
            break;
        }
          
        // Check and display alert message
    if (flag == true)
        return true;
    else
        return false;
}

var num = 2357;
var arr = []

while (num>0) {
    
    arr.push(prime(num%10));

    num=num/10;
}

if(arr.includes(true) && arr.includes(false)) {
    console.log("half prime");
}
else{
    console.log("not half prime");
}