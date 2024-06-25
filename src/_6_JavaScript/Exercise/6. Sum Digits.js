function solve(num){
   let sum = 0;

   for (let i = 0; i < String(num).length; i++) {
      sum += Number(String(num).charAt(i))
   }
   console.log(sum);
}

solve (245678)