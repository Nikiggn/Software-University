function solve(n1, op, n2){
   switch (op){
      case '+':
         console.log(Number(n1 + n2).toFixed(2))
         break;
      case '-':
         console.log(Number(n1 - n2).toFixed(2))
         break;
      case '/':
         console.log(Number(n1 / n2).toFixed(2))
         break;
      case '*':
         console.log(Number(n1 * n2).toFixed(2))
         break;
   }
}