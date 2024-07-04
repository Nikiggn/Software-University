function sum(num1, num2){
   let str = "";
   let sum = 0;

   for (let i = num1; i <= num2; i++) {
      sum += i;
      str = str + i + " ";
      if(i == num2){
         str.trim();
      }
   }

   console.log(str)
   console.log(`Sum: ${sum}`)
}

sum(5,10)