function solve(num, op1, op2, op3, op4, op5){
   let startingNum = Number(num);
   let array = [op1, op2 ,op3 ,op4,op5];

   for (let i = 0; i < array.length; i++) {
      switch(array[i]){
         case 'chop':
            startingNum /= 2;
            console.log(startingNum);
            break;
         case 'dice':
            startingNum = Math.sqrt(startingNum);
            console.log(startingNum);
            break;
         case 'spice':
            startingNum += 1;
            console.log(startingNum);
            break;
         case 'bake':
            startingNum *= 3;
            console.log(startingNum);
            break;
         case 'fillet':
            startingNum *= 0.8;
            console.log(startingNum.toFixed(1));
            break;
      }  
   }
}

solve('9', 'dice', 'spice', 'chop', 'bake', 'fillet')