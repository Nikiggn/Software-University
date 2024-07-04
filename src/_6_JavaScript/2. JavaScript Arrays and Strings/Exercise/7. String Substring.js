function solve(parameter, text){
   const match = text.split(" ").find((x) => x.toLowerCase() === parameter.toLowerCase());
   console.log(match ? parameter : `${parameter} not found!`);
}