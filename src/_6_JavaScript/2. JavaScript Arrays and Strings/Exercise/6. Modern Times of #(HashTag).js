function solve(input) {
   let regExp = new RegExp(`#[A-Za-z]+`, `g`)
   const machResult = input.match(regExp);
   for (const word of machResult) {
      console.log(word.substring(1));
   }
   
}

solve('Nowadays everyone uses # to tag a #special word in #socialMedia')