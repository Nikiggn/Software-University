// First

function solve(arr, step){ 

   let newArr = [];
   arr.forEach((item, index) => {
      if (index % step == 0){
         newArr.push(item);
      }
   })
   return newArr;   
}

// Second

function solve(arr, step){ 

   return (arr.filter((_, i) => i % step === 0));  
}


solve(['5', '20', '31', '4', '20'], 2)