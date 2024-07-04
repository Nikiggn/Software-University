function solve(input){
  let correctPass = input[0].split("").reverse().join('');
  let index = input.indexOf(`${correctPass}`);


  if (index >= 5 || index == -1) {
   console.log(`Incorrect password. Try again.`);
   console.log(`Incorrect password. Try again.`);
   console.log(`Incorrect password. Try again.`);
   console.log(`User ${input[0]} blocked!`);
  }else {
   for (let i = 1; i <= index; i++) {
      if(i == index){
        console.log(`User ${input[0]} logged in.`);
      }else {
         console.log(`Incorrect password. Try again.`);
      }
   }
  }
}

solve(['Acer','login','go','let me in','recA'])