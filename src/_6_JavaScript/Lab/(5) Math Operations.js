function mathOperation(num1, num2, operator1) {
   switch(operator1){
      case '+':
         console.log(num1 + num2);
         break;
      case '-':
         console.log(num1 - num2);
         break;
      case '*':
         console.log(num1 * num2);
         break;
      case '/':
         console.log(num1 / num2);
         break;
      case '%':
         console.log(num1 % num2);
         break;
      case '**':
         console.log(num1 ** num2);
         break;
   }
}